package WeatherApplication;

public class StatisticDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private float pressure;

	public StatisticDisplay() {
		// TODO Auto-generated constructor stub
		temp = 0;
		humidity = 0;
		pressure = 0;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.format("average temperature : %.2f\n",temp);
		System.out.format("average humidity : %.2f\n",humidity);
		System.out.format("average pressure : %.2f\n",pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity= humidity;
		this.pressure = pressure;
		
		//정보가 update 되면 화면에 바로 띄우기
		display();
	}

}
