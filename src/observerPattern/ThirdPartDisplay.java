package observerPattern;

public class ThirdPartDisplay implements Observer,DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public ThirdPartDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("ThirdParty; conditions:"+temperature+
				"F degree and "+humidity+"% humidity"+"Pressure "+ pressure);
	}
	
	@Override
	public void update(float temp, float humdity, float pressure) {
		this.temperature=temp;
		this.humidity=humdity;
		this.pressure=pressure;
		display();
	}


}
