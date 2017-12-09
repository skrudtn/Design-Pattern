package WeatherApplication;

public interface Observer {
	//모든 Observer는 아래 update method를 구현해야 함
	public void update(float temp, float humidity, float pressure);
}
