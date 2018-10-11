
import java.util.List;
import java.util.Random;

/**
 *
 * A simple model of a seaweed.
 *
 * @author Henrique David and Abraão Dantas
 */
public class Seaweed implements Actor{

    private boolean alive;
    private Ocean ocean;
    private Location location;
    
 // The age at which a seaweed can start to breed.
    private static final int BREEDING_AGE = 5;
    // The age to which a seaweed can live.
    private static final int MAX_AGE = 40;
    // The likelihood of a seaweed breeding.
    private static final double BREEDING_PROBABILITY = 0.15;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 4;
    
    private Random random;
    // The age of an seaweed.
    private int age;


    public Seaweed(Ocean ocean, Location location) {
        alive = true;
        this.ocean = ocean;
        setLocation(location);
        age = 0;
        random = new Random();
    }

    /**
     * Verifies if the seaweed is alive
     *
     * @return true is the seaweed is still alive
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Kills the seaweed and removes it from the ocean
     */
    public void setDead() {
        alive = false;
        if (location != null) {
            ocean.clear(location);
            location = null;
            ocean = null;
        }
    }

    /**
     * Return the current seaweed's location
     *
     * @return The current seaweed's location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Place the seaweed at the new location in the given ocean.
     *
     * @param location The seaweed's new location.
     */
    public void setLocation(Location location) {
        if (this.location != null) {
            ocean.clear(this.location);
        }
        this.location = location;
        ocean.place(this, location);
    }

    /**
     * This is what the seaweed does most of the time - it runs 
     * around. Sometimes it will breed or die of old age.
     * @param newActors A list to add newly born seaweed to.
     */
	@Override
	public void act(List<Actor> newActors) {
		incrementAge();
		if(isAlive()) {
			giveBirth(newActors);
		}
		
	}

    /**
     * Increase the age.
     * This could result in the seaweed's death.
     */
	@Override
	public void incrementAge() {
		age++;		
		
		if(age > MAX_AGE) {
			setDead();
		}
	}

    /**
	 * Return the seaweed's ocean
	 * @return The seaweed's ocean
	 */
	@Override
	public Ocean getOcean() {
		return ocean;
	}

    /**
     * Check whether or not this seaweed is to give birth at this step.
     * New births will be made into free adjacent locations.
     * @param newActors A list to add newly born seaweed to.
     */
	@Override
	public void giveBirth(List<Actor> newActors) {
		Ocean ocean = getOcean();
        List<Location> free = ocean.getFreeAdjacentLocations(getLocation());
        int births = breed();
        for(int b = 0; b < births && free.size() > 0; b++) {
            Location loc = free.remove(0);
            Seaweed young = new Seaweed(ocean, loc);
            newActors.add(young);
        }
		
	}

    /**
     * Generate a number representing the number of births, if it can breed.
     * @return The number of births (may be zero).
     */
	@Override
	public int breed() {
		int births = 0;
        if(canBreed() && random.nextDouble() <= BREEDING_PROBABILITY) {
        	births = random.nextInt(MAX_LITTER_SIZE) + 1;
        }
        return births;
	}

    /**
     * A seaweed can breed if it has reached the breeding age.
     * @return true if the seaweed can breed, false otherwise.
     */
	@Override
	public boolean canBreed() {
		return age >= BREEDING_AGE;
	}


}
