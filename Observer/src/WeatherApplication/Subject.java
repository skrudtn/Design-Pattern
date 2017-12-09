package WeatherApplication;

public interface Subject {
	// 아래의 두 method는 Observer를 등록하고 해지하는 역할
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	
	//Subject 객체의 상태가 변경되었을 때, 등록된 모든 옵저버들에게
	//알리기 위해 호출되는 메소드
	public void notifyObservers();
}
