import java.util.List;

/**
 * 
 * @author Abraão Dantas
 * @veriso 2018.10.10
 *
 */
public interface Actor {
	
	/**
	 * Verifies if the actor is alive
	 *
	 * @return true is the actor is still alive
	 */
	public boolean isAlive();

	/**
	 * Kills the actor and removes it from the ocean
	 */
	public void setDead();

	/**
	 * Make this Actor act - that is: make it do
	 * whatever it wants/needs to do.
	 * @param newActors A list to add newly born actors to.
	 */
	public abstract void act(List<Actor> newActors);

	/**
	 * Increase the age. This could result in the actor's death.
	 */
	public abstract void incrementAge();

	/**
	 * Return the current actor's location
	 * @return The current actor's location
	 */
	public Location getLocation();

	/**
	 * Place the fish at the new location in the given ocean.
	 * @param location The actor's new location.
	 */
	public void setLocation(Location location);

	/**
	 * Return the actor's ocean
	 * @return The actor's ocean
	 */
	public Ocean getOcean();

	/**
	 * Check whether or not this actor is to give birth at this step.
	 * New births will be made into free adjacent locations.
	 * @param newActors A list to add newly born fishes to.
	 */
	public abstract void giveBirth(List<Actor> newActors);

	/**
	 * Generate a number representing the number of births,
	 * if it can breed.
	 * @return The number of births (may be zero).
	 */
	public abstract int breed();

	/**
	 * A actor can breed if it has reached the breeding age.
	 */
	public abstract boolean canBreed();

}
