package WeatherApplication;

public interface Observer {
	//��� Observer�� �Ʒ� update method�� �����ؾ� ��
	public void update(float temp, float humidity, float pressure);
}
