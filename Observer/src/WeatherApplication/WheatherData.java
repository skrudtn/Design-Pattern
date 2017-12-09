package WeatherApplication;

import java.util.ArrayList;

public class WheatherData implements Subject{

	private float temp;
	private float humidity;
	private float pressure;
	private ArrayList<Observer> obList;
	
	public WheatherData() {
		temp = 0;
		humidity= 0;
		pressure = 0;
		obList = new ArrayList<Observer>(0);
		// TODO Auto-generated constructor stub
	}

	public WheatherData(float temp, float humidity, float pressure, ArrayList<Observer> obList) {
		this.temp = temp;
		this.humidity= humidity;
		this.pressure = pressure;
		this.obList = obList;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		obList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		obList.remove(o);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer ob : obList) {
			 ob.update(temp, humidity, pressure);
		}
	}
	
	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public void measurementsChanged(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity= humidity;
		this.pressure = pressure;
		
		//새로운 데이터가 들어오면 옵저버들 에게 정보를 알려줘야한다.
		notifyObservers();
	}
	
}
