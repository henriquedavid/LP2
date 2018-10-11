
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * A simple model of a sardine. sardines age, move, breed, and die. They eat
 * plankton. They exhibit flocking behaviour - they tend to seek company. If
 * they spot a predator close by, they panic.
 *
 * @author Henrique David
 */
public class Sardine extends Fish {

    // The age at which a sardine can start to breed.
    private static final int BREEDING_AGE = 5;
    // The age to which a sardine can live.
    private static final int MAX_AGE = 40;
    // The likelihood of a sardine breeding.
    private static final double BREEDING_PROBABILITY = 0.15;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 4;
    // The food value of a single sardine. In effect, this is the
    // number of steps a sardine can go before it has to eat again.
    private static final int SARDINE_FOOD_VALUE = 10;

    private Random random;

    // The total level of food that an Sardine can eat.
    private int foodLevel;
    // The age of an sardine.
    private int age;

    /**
     * Create a Sardine. A sardine can be created as a new born (age zero and
     * not hungry) or with a random age and food level.
     *
     * @param ocean The field currently occupied.
     * @param location The location within the field.
     * @param randomInfo If true, the sardine can have a default value to age
     * and food level.
     */
    public Sardine(Ocean ocean, Location location, boolean randomInfo) {
        super(ocean, location);
        random = new Random();
        if (randomInfo) {
            age = random.nextInt(MAX_AGE);
            foodLevel = random.nextInt(SARDINE_FOOD_VALUE);
        } else {
            this.age = 0;
            this.foodLevel = SARDINE_FOOD_VALUE;
        }
    }

    /**
     * This is what the sardine does most of the time - it runs around.
     * Sometimes it will breed or die of old age.
     *
     * @param newSardine A list to add newly born Sardine to.
     */
    @Override
    public void act(List<Actor> newSardine) {

        incrementAge();
        incrementHunger();
        if (isAlive()) {
            giveBirth(newSardine);
            Location location = getLocation();
            Location newLocation = findFood(getLocation());
            if (newLocation == null) {
                newLocation = getOcean().freeAdjacentLocationForSardine(location);
            }

            if (newLocation != null) {
                setLocation(newLocation);
            } else {
                setDead();
            }
        }
    }

    /**
     * Increase the age. This could result in the sardine's death.
     */
    @Override
    public void incrementAge() {
        age++;

        if (age > MAX_AGE) {
            setDead();
        }

    }

    /**
     * Increase hunger. This make the sardine feels more hunger.
     */
    @Override
    public void incrementHunger() {
        foodLevel--;
        if (foodLevel <= 0) {
            setDead();
        }

    }

    /**
     * Make sardine find food. The only thing that sardine eats is algas.
     *
     * @param location Verify if on a location there's food.
     */
    @Override
    public Location findFood(Location location) {
        Ocean ocean = getOcean();
        List<Location> adjacente = ocean.adjacentLocations(getLocation());

        Iterator<Location> it = adjacente.iterator();
        while (it.hasNext()) {
            Location where = it.next();
            Seaweed animal = ocean.getSeaweedAt(where);
            if (animal != null) {
                if (animal.isAlive()) {
                    animal.setDead();
                    foodLevel = SARDINE_FOOD_VALUE;
                    return where;
                }
            }

        }
        return null;

    }

    /**
     * Check whether or not this sardine is to give birth at this step. New
     * births will be made into free adjacent locations.
     *
     * @param newSardines A list to add newly born sardine to.
     */
    @Override
    public void giveBirth(List<Actor> newSardines) {
        Ocean ocean = getOcean();
        List<Location> free = ocean.getFreeAdjacentLocations(getLocation());
        int births = breed();
        for (int b = 0; b < births && free.size() > 0; b++) {
            Location loc = free.remove(0);
            Sardine young = new Sardine(ocean, loc, false);
            newSardines.add(young);
        }

    }

    /**
     * Generate a number representing the number of births, if it can breed.
     *
     * @return The number of births (may be zero).
     */
    @Override
    public int breed() {
        int births = 0;

        if (canBreed() && random.nextDouble() <= BREEDING_PROBABILITY) {
            births = random.nextInt(MAX_LITTER_SIZE) + 1;
        }

        return births;
    }

    /**
     * A sardine can breed if it has reached the breeding age.
     *
     * @return true if the sardine can breed, false otherwise.
     */
    @Override
    public boolean canBreed() {
        return age >= BREEDING_AGE;
    }

}
