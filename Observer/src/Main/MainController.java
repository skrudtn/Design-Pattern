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
		
		//옵저버 등록
		wd.registerObserver(cc1);
		wd.registerObserver(cc2);
		wd.registerObserver(fd);
		wd.registerObserver(sd);
		
		//새로운 정보 입력
		System.out.format("\n새로운 정보 입력\n");
		wd.measurementsChanged(25, 88, 1);
		wd.measurementsChanged(24, 58, 0.8f);
		wd.measurementsChanged(23, 66, 0.7f);
		
		//옵저버 제거
		wd.removeObserver(cc2);
		
		//새로운 정보 입력
		System.out.format("\n새로운 정보 입력\n");
		wd.measurementsChanged(13, 69,1.1f);
	}

}
