package WeatherApplication;

public interface Subject {
	// �Ʒ��� �� method�� Observer�� ����ϰ� �����ϴ� ����
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	
	//Subject ��ü�� ���°� ����Ǿ��� ��, ��ϵ� ��� �������鿡��
	//�˸��� ���� ȣ��Ǵ� �޼ҵ�
	public void notifyObservers();
}
