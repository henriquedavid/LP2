
/**
 * Write a description of class Fish here.
 * Those lines codes are based at Project Fox and rabbits v2, developed by David J. Barnes and Michael Kolling
 * 
 * NOTE: This should serve as a superclass to all specific tyes of fish
 * 
 * @author Abraão Dantas 
 * @version 2018.10.03
 */
public abstract class Fish implements Actor
{
	/**
	 * Constructor for objects of class Fish
	 */
	private boolean alive;
	private Ocean ocean;
	private Location location;
	//private int age;
	//private int foodLevel;
	
	/**
	 * Create a new Fish at location in ocean
	 * @param ocean The ocean occupied
	 * @param location The current location at ocean
	 */
	public Fish(Ocean ocean, Location location){
		alive = true;
		this.ocean = ocean;
		setLocation(location);
	}
	
	/**
	 * Verifies if the fish is alive
	 * @return true is the fish is still alive 
	 */
	public boolean isAlive(){
		return alive;
	}
	
	/**
	 * Kills the fish and removes it from the ocean
	 */
	public void setDead(){
		alive = false;
		if(location != null) {
			ocean.clear(location);
			location = null;
			ocean = null;
		}
	}
	
	/**
	 * Return the current fish's location
	 * @return The current fish's location
	 */
	public Location getLocation() {
		return location;
	}
	
	/**
     * Place the fish at the new location in the given ocean.
     * @param location The fish's new location.
     */
	public void setLocation(Location location) {
		if(this.location != null) {
			ocean.clear(this.location);
		}
		this.location = location;
		ocean.place(this, location);
	}

	/*maybe we need...
	 * 
	 * public int getFoodLevel() {
		return foodLevel;
	}

	public void setFoodLevel(int foodLevel) {
		this.foodLevel = foodLevel;
	}*/
	
	/**
	 * Return the fish's ocean
	 * @return The fish's ocean
	 */
	public Ocean getOcean() {
		return ocean;
	}
	 
	/**
     * Increase the hunger of the fish.
     */
	public abstract void incrementHunger();
	
	/**
     * Tell the Fish to look for food adjacent to its current location.
     * Only the first live food is eaten.
     * @param location Where in the Ocean it is located.
     * @return Where food was found, or null if it wasn't.
     */
	public abstract Location findFood(Location location);
	
	/**
     * Check whether or not this Fish is to give birth at this step.
     * New births will be made into free adjacent locations.
     * @param newFishes A list to add newly born fishes to.
     */
	/*
	public abstract void giveBirth(List<Actor> newActors);
	
	 /**
     * Generate a number representing the number of births,
     * if it can breed.
     * @return The number of births (may be zero).
     *
	public abstract int breed();
	
	/**
     * A fish can breed if it has reached the breeding age.
     *
	public abstract boolean canBreed();
	*/


}
