package Duck;

public class RubberDuck extends Duck{
	public RubberDuck() {
		cryBehavior = new MuteQuack();
		flyBehavior = new FlyWithWings();
	}
	//RubberDuck �����ڿ���
	//cry, fly�� �ൿ�� ����.
	//����� �������� �������̽� ��ü�� ���۷��� ��ȯ�� ����
	
	public void display() {
		System.out.println("This is Rubber Duck!");
	}
}
