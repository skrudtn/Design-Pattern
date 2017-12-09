package Main;

import WeatherApplication.CurrentConditions;
import WeatherApplication.ForecastDisplay;
import WeatherApplication.Observer;
import WeatherApplication.StatisticDisplay;
import WeatherApplication.WheatherData;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WheatherData wd = new WheatherData();
		Observer cc1 = new CurrentConditions();
		Observer cc2 = new CurrentConditions();
		Observer fd = new ForecastDisplay();
		Observer sd = new StatisticDisplay();
		
		//������ ���
		wd.registerObserver(cc1);
		wd.registerObserver(cc2);
		wd.registerObserver(fd);
		wd.registerObserver(sd);
		
		//���ο� ���� �Է�
		System.out.format("\n���ο� ���� �Է�\n");
		wd.measurementsChanged(25, 88, 1);
		wd.measurementsChanged(24, 58, 0.8f);
		wd.measurementsChanged(23, 66, 0.7f);
		
		//������ ����
		wd.removeObserver(cc2);
		
		//���ο� ���� �Է�
		System.out.format("\n���ο� ���� �Է�\n");
		wd.measurementsChanged(13, 69,1.1f);
	}

}
