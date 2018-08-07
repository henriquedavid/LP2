public class Heater{

	private int temperature;
	private int min;
	private int max;
	private int increment;

	public Heater(int min_, int max_){
		this.temperature = 15;
		this.min = min_;
		this.max = max_;
		this.increment = 5;
	}

	public void Warmer(){
		this.temperature += increment;
		if(temperature > max){
			this.temperature = max;
		}
	}

	public void Cooler(){
		this.temperature -= increment;
		if(temperature < min){
			this.temperature = min;
		}
	}

	public int getTemperature(){
		return this.temperature;
	}

}
