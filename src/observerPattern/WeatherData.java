package observerPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		observers.remove(i);
	}

	@Override
	public void notifyObserver() {
		for (Observer ob : observers) {
			ob.update(temperature, humidity, pressure);
		}
	}

	public void measurementChanged() {
		notifyObserver();
	}

	public void setMeasurements(float tem, float humidity, float pressure) {
		this.temperature = tem;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
}
