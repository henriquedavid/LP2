import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Those lines codes are based at Project Fox and rabbits v2, developed by David J. Barnes and Michael Kolling
 * @author Abraão Dantas
 * @version 2018.10.03
 */
public class Ocean
{
	private int height;
	private int width;
	private Actor [][] ocean;
	private static final Random rand = Randomizer.getRandom();
    /**
     * Represent an ocean of the given dimensions.
     * @param height The height of the ocean.
     * @param width The width of the ocean.
     */
    public Ocean(int height, int width)
    {
        this.height = height;
        this.width = width;
        ocean = new Actor[height][width];
    }
    
    /**
     * Empty the field.
     */
    public void clear(){
        for(int row = 0; row < height; row++) {
            for(int col = 0; col < width; col++) {
                ocean[row][col] = null;
            }
        }
    }
    
    /**
     * Clear the given location.
     * @param location The location to clear.
     */
    public void clear(Location location){
        ocean[location.getRow()][location.getCol()] = null;
    }
    
    
    /**
     * Return the fish at the given location, if any.
     * @param row The desired row.
     * @param col The desired column.
     * @return The fish at the given location, or null if there is none.
     */
    public Fish getFishAt(int row, int col){
    	if(ocean[row][col] instanceof Fish) {
    		return (Fish) ocean[row][col];
    	}else {
    		return null;
    	}
    }
    
    /**
     * Return the seaweed at the given location, if any.
     * @param row The desired row.
     * @param col The desired column.
     * @return The seaweed at the given location, or null if there is none.
     */
    public Seaweed getSeaweedAt(int row, int col) {
    	if(ocean[row][col] instanceof Seaweed) {
    		return (Seaweed) ocean[row][col];
    	}else {
    		return null;
    	}
    }
    
    /**
     * Return the fish at the given location, if any.
     * @param Location of the desired fish.
     * @return The fish at the given location, or null if there is none.
     */
    public Fish getFishAt(Location location)
    {
        return getFishAt(location.getRow(), location.getCol());
    }
    
    /**
     * Return the seaweed at the given location, if any.
     * @param Location of the desired fish.
     * @return The seaweed at the given location, or null if there is none.
     */
    public Seaweed getSeaweedAt(Location location)
    {
        return getSeaweedAt(location.getRow(), location.getCol());
    }
    
    /**
     * Place a fish at the given location.
     * If there is already a fish at the location it will
     * be lost.
     * @param fish The fish to be placed.
     * @param row Row coordinate of the location.
     * @param col Column coordinate of the location.
     */
    public void place(Actor actor, int row, int col)
    {
       ocean[row][col] = actor;
    }
    
    /**
     * Place a fish at the given location.
     * If there is already  fish at the location it will
     * be lost.
     * @param fish The fish to be placed.
     * @param location Where to place the animal.
     */
    public void place(Actor actor, Location location)
    {
        place(actor, location.getRow(), location.getCol());
    }
    
    /**
     * Generate a random location that is adjacent to the
     * given location, or is the same location.
     * The returned location will be within the valid bounds
     * of the field.
     * @param location The location from which to generate an adjacency.
     * @return A valid location within the grid area.
     */
    public Location randomAdjacentLocation(Location location)
    {
        List<Location> adjacent = adjacentLocations(location);
        return adjacent.get(0);
    }
    
    /**
     * Get a shuffled list of the free adjacent locations.
     * @param location Get locations adjacent to this.
     * @return A list of free adjacent locations.
     */
    public List<Location> getFreeAdjacentLocations(Location location)
    {
        List<Location> free = new LinkedList<Location>();
        List<Location> adjacent = adjacentLocations(location);
        for(Location next : adjacent) {
            if(getFishAt(next) == null || getSeaweedAt(next) == null) {
                free.add(next);
            }
        }
        return free;
    }
    
    /**
     * Try to find a free location that is adjacent to the
     * given location. If there is none, return null.
     * The returned location will be within the valid bounds
     * of the field.
     * @param location The location from which to generate an adjacency.
     * @return A valid location within the grid area.
     */
    public Location freeAdjacentLocation(Location location)
    {
        // The available free ones.
        List<Location> free = getFreeAdjacentLocations(location);
        if(free.size() > 0) {
            return free.get(0);
        }
        else {
            return null;
        }
    }
    
    /**
     * Try to find a free location and has at least one sardine that is adjacent
     * to the given location. If there is none, return null.
     * The returned location will be within the valid bounds of the field.
     * @param location The location from whick to generate an adjacency.
     * @return A valid location within the grid area.
     */
    public Location freeAdjacentLocationForSardine(Location location)
    {
        List<Location> positions = new LinkedList<Location>(); ;
        List<Location> adjacent = adjacentLocations(location);
        for(Location next : adjacent) {
            if(getFishAt(next) == null || getSeaweedAt(next) == null || getFishAt(next) instanceof Sardine) {
                // Verify if the fish on that location is an Sardine, then add them.
                    positions.add(next);
            }
        }
        // Verify if there is at least one sardine near it and more than one free space.
        if(positions.size() > 0) {
            int pos = -1;
            for(Location next : positions){
                if( pos == -1 && !(getFishAt(next) instanceof Sardine))
                    pos++;
            }
            if(pos != -1) {
            	return positions.get(pos);
            }
            return null;
        }
        else {
            return null;
        }
    }

    /**
     * Return a shuffled list of locations adjacent to the given one.
     * The list will not include the location itself.
     * All locations will lie within the grid.
     * @param location The location from which to generate adjacencies.
     * @return A list of locations adjacent to that given.
     */
    public List<Location> adjacentLocations(Location location)
    {
        assert location != null : "Null location passed to adjacentLocations";
        // The list of locations to be returned.
        List<Location> locations = new LinkedList<Location>();
        if(location != null) {
            int row = location.getRow();
            int col = location.getCol();
            for(int roffset = -1; roffset <= 1; roffset++) {
                int nextRow = row + roffset;
                if(nextRow >= 0 && nextRow < height) {
                    for(int coffset = -1; coffset <= 1; coffset++) {
                        int nextCol = col + coffset;
                        // Exclude invalid locations and the original location.
                        if(nextCol >= 0 && nextCol < width && (roffset != 0 || coffset != 0)) {
                            locations.add(new Location(nextRow, nextCol));
                        }
                    }
                }
            }
            
            // Shuffle the list. Several other methods rely on the list
            // being in a random order.
            Collections.shuffle(locations, rand);
        }
        return locations;
    }
    
    /**
     * @return The height of the ocean.
     */
    public int getHeight()
    {
        return height;
    }
    
    /**
     * @return The width of the ocean.
     */
    public int getWidth()
    {
        return width;
    }
}
