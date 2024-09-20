package observerPattern;

public class WeatherStation {

	public static void main(String[] args) {
		
			WeatherData weatherData=new WeatherData();
			WeatherData weatherDataOne=new WeatherData();
			//screens
			CurrentConditionsDisplay currentDisplay=
					new CurrentConditionsDisplay(weatherData);
			ThirdPartDisplay trdPart=new ThirdPartDisplay(weatherData);
			StatisticsDisplay stDisplay=new StatisticsDisplay(weatherData);
			ForecastDisplay forecasrDisplay=new ForecastDisplay(weatherData);
			
	
			weatherData.setMeasurements(20, 20, 20);
			//weatherData.setMeasurements(120, 120, 120);
			
						
	}

}
