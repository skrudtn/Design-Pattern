package WeatherApplication;

public class ForecastDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private float pressure;

	public ForecastDisplay() {
		// TODO Auto-generated constructor stub
		temp = 0;
		humidity = 0;
		pressure = 0;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.format("tomorrow temperature : %.2f\n",temp);
		System.out.format("tomorrow humidity : %.2f\n",humidity);
		System.out.format("tomorrow pressure : %.2f\n",pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity= humidity;
		this.pressure = pressure;

		//������ update �Ǹ� ȭ�鿡 �ٷ� ����
		display();
	}

}
