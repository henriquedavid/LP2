public class Vehicle{

	// A unique ID for the Vehicle
	private String id;
	// The destination of the vehicle
	private String destination;
	// The location of the vehicle
	private String location;

	/**
	 * Constructor for objects.
	 * @param i The id from the vehicle
	 * @param d The destination to the vehile
	 * @param l The vehicle's location
	 */
	public Vehicle( String i, String d, String l ){
		this.id = i;
		this.destination = d;
		this.location = l;
	}
	
	/**
	 * Second constructor of class vehicle.
	 * @param i The id vehicle.
	 */
	public Vehicle( String i ){
		id = i;
	}

	/**
	 * Return the ID of the vehicle.
	 * @return The ID of the vehicle.
	 */
	public String getID(){
		return id;
	}

	/**
	 * Return the destination of the vehicle.
	 * @return The destination of the vehicle.
	 */
	public String getDestination(){
		return destination;
	}

	/**
	 * Return the location of the vehicle().
	 * @return The location of the vehicle.
	 */
	public String getLocation(){
		return location;
	}

	/**
	 * Set the intented destination of the vehicle.
	 * @param destination The intended destination.
	 */
	public void setDestination( String destination ){
		this.destination = destination;
	}

	/**
	 * Set the intented location of the vehicle.
	 * @param location The intented location.
	 */
	public void setLocation( String location ){
		this.location = location;
	}


	/**
	 * Return the status of the vehicle.
	 * @return The status.
	 */
	public String getStatus(){

		if( destination.equals(null)){
			return "There is no destination to the vehicle!";
		}

		return id + " at " + location + " headed for " + destination;
	}
}
