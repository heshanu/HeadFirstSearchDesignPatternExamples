package observerPattern;

public class StatisticsDisplay implements Observer,DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humdity, float pressure) {
		this.temperature=temp;
		this.humidity=humdity;
		this.pressure=pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Statistics conditions:"+temperature+"F degree and "
	+humidity+"% humidity"+" Pressure "+pressure);
		
	}


}
