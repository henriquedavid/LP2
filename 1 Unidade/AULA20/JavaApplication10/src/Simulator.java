
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author Abraão Dantas
 * @version 2018.10.10
 */
public class Simulator {
    //The default height for the ocean

    private static final int DEFAULT_HEIGHT = 50;
    //The default width for the ocean
    private static final int DEFAULT_WIDTH = 50;
    //The probability that a actor will be created
    private static final double SHARK_CREATION_PROBABILITY = 0.01;
    private static final double TUNA_CREATION_PROBABILITY = 0.02;
    private static final double SARDINE_CREATION_PROBABILITY = 0.03;
    private static final double SEAWEED_CREATION_PROBABILITY = 0.04;

    //List of actors in the ocean
    private List<Actor> actors;
    //The current state of the ocean
    private Ocean ocean;
    //The current step of the simulation
    private int step;
    //Graphical visualization of the simulation
    private SimulatorView simView;

    public static void main(String[] args) throws InterruptedException {
        Simulator sim = new Simulator(DEFAULT_HEIGHT, DEFAULT_WIDTH);
        
        sim.run(1000);
    }

    public Simulator() {
        this(DEFAULT_HEIGHT, DEFAULT_WIDTH);
    }

    public Simulator(int height, int width) {
        if (height <= 0 || width <= 0) {
            height = DEFAULT_HEIGHT;
            width = DEFAULT_WIDTH;
        }

        actors = new ArrayList<Actor>();
        ocean = new Ocean(height, width);
        simView = new SimulatorView(height, width);

        // define in which color fish should be shown
        simView.setColor(Shark.class, Color.red);
        simView.setColor(Tuna.class, Color.black);
        simView.setColor(Sardine.class, Color.blue);
        simView.setColor(Seaweed.class, Color.green);

        reset();
    }

    public void run(int steps) throws InterruptedException {
        for (int step = 1; step <= steps && simView.isViable(ocean); step++) {
            Thread.sleep(1000);
            this.step++;
            List<Actor> newActors = new ArrayList<Actor>();
            Actor aux;
            for (Iterator<Actor> it = actors.iterator(); it.hasNext();) {
                aux = it.next();
                aux.act(newActors);
                if (!aux.isAlive()) {
                    it.remove();
                }
            }

            actors.addAll(newActors);
            simView.showStatus(this.step, ocean);
        }
    }

    public void reset() {
        step = 0;
        actors.clear();
        ocean.clear();
        populate();

        simView.showStatus(step, ocean);
    }

    public void populate() {
        Random rand = Randomizer.getRandom();
        Location location;
        double rand_aux;
        //System.out.println("Rodou aq");
        for (int row = 0; row < ocean.getHeight(); row++) {
            for (int col = 0; col < ocean.getWidth(); col++) {
                rand_aux = rand.nextDouble();
                if (rand_aux <= SHARK_CREATION_PROBABILITY) {
                    location = new Location(row, col);
                    Shark shark = new Shark(ocean, location, true);
                    actors.add(shark);
                } else if (rand_aux <= TUNA_CREATION_PROBABILITY) {
                    location = new Location(row, col);
                    Tuna tuna = new Tuna(ocean, location, true);
                    actors.add(tuna);
                } else if (rand_aux <= SARDINE_CREATION_PROBABILITY) {
                    location = new Location(row, col);
                    Sardine sardine = new Sardine(ocean, location, true);
                    actors.add(sardine);
                } else if (rand_aux <= SEAWEED_CREATION_PROBABILITY) {
                    location = new Location(row, col);
                    Seaweed seaweed = new Seaweed(ocean, location);
                    actors.add(seaweed);
                }
            }
        }
        //Only for tests, remove later
//    	for(int i=0; i<actors.size(); i++) {
//    		Actor aux = actors.get(i);
//    		if(aux instanceof Shark) {
//    			System.out.println("Shark");
//    		}else if( aux instanceof Tuna) {
//    			System.out.println("Tuna");
//    		}else if(aux instanceof Sardine) {
//    			System.out.println("sardine");
//    		}else {
//    			System.out.println("Seaweed");
//    		}
//    	}
    }
}
