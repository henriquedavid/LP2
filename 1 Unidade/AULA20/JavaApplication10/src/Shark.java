
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * A simple model of a shark. Sharks age, move, breed, and die. Sharks eat
 * groper or herring but they prefer groper. Sharks are loners - they prefer not
 * to swim next to each other
 *
 * @author Henrique David
 */
public class Shark extends Fish {

    // The age at which a shark can start to breed.
    private static final int BREEDING_AGE = 5;
    // The age to which a shark can live.
    private static final int MAX_AGE = 40;
    // The likelihood of a shark breeding.
    private static final double BREEDING_PROBABILITY = 0.15;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 4;
    // The food value of a single shark. In effect, this is the
    // number of steps a shark can go before it has to eat again.
    private static final int SHARK_FOOD_VALUE = 10;
    
    
    private Random random;

    // The total level of food that an shark can eat.
    private int foodLevel;
    // The age of an shark.
    private int age;

    /**
     * Create a Shark. A shark can be created as a new born (age zero
     * and not hungry) or with a random age and food level.
     * 
     * @param ocean The field currently occupied.
     * @param location The location within the field.
     * @param randomInfo If true, the shark can have a default value to age and
     * food level.
     */
    public Shark(Ocean ocean, Location location, boolean randomInfo) {
        super(ocean, location);
        random = new Random();
        if(randomInfo){
            age = random.nextInt(MAX_AGE);
            foodLevel = random.nextInt(SHARK_FOOD_VALUE);
        } else{
            this.age = 0;
            this.foodLevel = SHARK_FOOD_VALUE;
        }
    }

    /**
     * This is what the shark does most of the time - it runs 
     * around. Sometimes it will breed or die of old age.
     * @param newSharks A list to add newly born shark to.
     */
    @Override
    public void act(List<Actor> newSharks) {
        incrementAge();
        incrementHunger();
        if(isAlive()){
            giveBirth(newSharks);
            // Try to move into a free location. Where there's alga.
            Location location = getLocation();
            Location newLocation = findFood(getLocation());
            if(newLocation == null)
                newLocation = getOcean().freeAdjacentLocation(location);
            
            
            if(newLocation != null){
                setLocation(newLocation);
            } else{
                setDead();
            }
        }

    }

    /**
     * Increase the age.
     * This could result in the shark's death.
     */
    @Override
    public void incrementAge() {
        age++;
        
        if(age > MAX_AGE)
            setDead();

    }

    /**
     * Increase hunger.
     * This make the shark feels more hunger.
     */
    @Override
    public void incrementHunger() {
        foodLevel--;
        if( foodLevel <= 0 )
            setDead();

    }

    /**
     * Make shark find food. They can eat sardines and tuna, but they prefer
     * tunas.
     * 
     * @param location Verify if on a location there's food.
     */
    @Override
    public Location findFood(Location location) {
        Ocean ocean = getOcean();
        List<Location> adjacente = ocean.adjacentLocations(getLocation());
        
        Iterator<Location> it = adjacente.iterator();
        while(it.hasNext()) {
            Location where = it.next();
            Fish animal = ocean.getFishAt(where);
            if(animal instanceof Tuna) {
                if(animal.isAlive()) { 
                    animal.setDead();
                    foodLevel = SHARK_FOOD_VALUE;
                    return where;
                }
            } else if( animal instanceof Sardine){
                if(animal.isAlive()) { 
                    animal.setDead();
                    foodLevel = SHARK_FOOD_VALUE;
                    return where;
                }
            }
        }
        
        return null;
    }
    

    /**
     * Check whether or not this shark is to give birth at this step.
     * New births will be made into free adjacent locations.
     * @param newSharks A list to add newly born shark to.
     */
    @Override
    public void giveBirth(List<Actor> newSharks) {
        Ocean ocean = getOcean();
        List<Location> free = ocean.getFreeAdjacentLocations(getLocation());
        int births = breed();
        for(int b = 0; b < births && free.size() > 0; b++) {
            Location loc = free.remove(0);
            Shark young = new Shark(ocean, loc, false);
            newSharks.add(young);
        }

    }

    /**
     * Generate a number representing the number of births, if it can breed.
     * @return The number of births (may be zero).
     */
    @Override
    public int breed() {
        int births = 0;
        
        if(canBreed() && random.nextDouble() <= BREEDING_PROBABILITY)
            births = random.nextInt(MAX_LITTER_SIZE) + 1;
        
        return births;
    }

    /**
     * A shark can breed if it has reached the breeding age.
     * @return true if the shark can breed, false otherwise.
     */
    @Override
    public boolean canBreed() {
        return age >= BREEDING_AGE;
    }

}
