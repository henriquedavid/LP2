/**
 * Represent the location of a fish in a rectangular grid
 * 
 * @author Abraão Dantas
 * @version 2018.10.03
 */
public class Location{

	//Row and column positions
	private int row;
	private int col;

	/**
	 * Creates object Location representing a row and column
	 * @param row The row.
	 * @param col The column.
	 */

	public Location(int row, int col){
		this.row = row;
		this.col = col;
	}

	/**
	 * Content equality test
	 * @param obj The Location object.
	 */
	public boolean equals(Location obj){
		if(obj instanceof Location){
			Location aux = (Location) obj;
			return row == aux.getRow() && col == aux.getCol();
		}else{
			return false;
		}
	}
	
	/**
	 * Return a String of the form row,column 
	 * @return Return a String representing the location
	 */
	public String toString() {
		return row + "," + col;
	}
	
	/**
	 * Use the top 16 bits for the row value and the bottom for
	 * the column. Except for very big grids, this should give a
	 * unique hash code for each (row, col) pair.
	 * @return A hashcode for the location.
	 */
	public int hashCode() {
		return (row << 16) + col;
	}
	
	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}
	
	/**
	 * @return the column
	 */
	public int getCol() {
		return col;
	}


}