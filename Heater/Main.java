public class Main{
	public static void main( String[] args ){
		
		Heater heater = new Heater(-10, 45);
		System.out.println("Temp: " + heater.getTemperature());
		heater.Cooler();
		System.out.print("Temp: " + heater.getTemperature());
		heater.Warmer();
		System.out.print("Temp: " + heater.getTemperature());
		
		int i = 0;
		while(i < 10){
			i++;
			heater.Cooler();
			System.out.println("Temp: " + heater.getTemperature());
			
		}

	}
}
