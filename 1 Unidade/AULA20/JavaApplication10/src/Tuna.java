
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * A simple model of a tuna. Tuna age, move, breed, and die. They eat herring.
 *
 * @author Henrique David
 */
public class Tuna extends Fish {

    // The age at which a tuna can start to breed.
    private static final int BREEDING_AGE = 5;
    // The age to which a tuna can live.
    private static final int MAX_AGE = 40;
    // The likelihood of a tuna breeding.
    private static final double BREEDING_PROBABILITY = 0.25;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 6;
    // The food value of a single tuna. In effect, this is the
    // number of steps a tuna can go before it has to eat again.
    private static final int TUNA_FOOD_VALUE = 15;

    
    private Random random;

    // The total level of food that an Tuna can eat.
    private int foodLevel;
    // The age of an tuna.
    private int age;

    /**
     * Create a Tuna. A tuna can be created as a new born (age zero
     * and not hungry) or with a random age and food level.
     * 
     * @param ocean The field currently occupied.
     * @param location The location within the field.
     * @param randomInfo If true, the tuna can have a default value to age and
     * food level.
     */
    public Tuna(Ocean ocean, Location location, boolean randomInfo) {
        super(ocean, location);
        random = new Random();
        if(randomInfo){
            age = random.nextInt(MAX_AGE);
            foodLevel = random.nextInt(TUNA_FOOD_VALUE);
        } else{
            this.age = 0;
            this.foodLevel = TUNA_FOOD_VALUE;
        }
    }

    /**
     * This is what the tuna does most of the time - it runs 
     * around. Sometimes it will breed or die of old age.
     * @param newFishes A list to add newly born tuna to.
     */
    @Override
    public void act(List<Actor> newTunas) {
        incrementAge();
        incrementHunger();
        if(isAlive()){
            giveBirth(newTunas);
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
     * This could result in the tuna's death.
     */
    @Override
    public void incrementAge() {
        age++;
        
        if(age > MAX_AGE)
            setDead();
        
    }

    /**
     * Increase hunger.
     * This make the tuna feels more hunger.
     */
    @Override
    public void incrementHunger() {
        foodLevel--;
        if( foodLevel <= 0 )
            setDead();

    }

    /**
     * Make tuna find food. The only thing that tuna eats is sardine.
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
            if(animal instanceof Sardine) {
                if(animal.isAlive()) { 
                    animal.setDead();
                    foodLevel = TUNA_FOOD_VALUE;
                    return where;
                }
            }
        }
        return null;
    }

    /**
     * Check whether or not this tuna is to give birth at this step.
     * New births will be made into free adjacent locations.
     * @param newTunas A list to add newly born tunas to.
     */
    @Override
    public void giveBirth(List<Actor> newTunas) {
        // New tunas are born into adjacent locations.
        // Get a list of adjacent free locations.
        Ocean ocean = getOcean();
        List<Location> free = ocean.getFreeAdjacentLocations(getLocation());
        int births = breed();
        for(int b = 0; b < births && free.size() > 0; b++) {
            Location loc = free.remove(0);
            Tuna young = new Tuna(ocean, loc, false);
            newTunas.add(young);
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
     * A tuna can breed if it has reached the breeding age.
     * @return true if the tuna can breed, false otherwise.
     */
    @Override
    public boolean canBreed() {
        return age >= BREEDING_AGE;
    }

}
