package Duck;

public class RedheadDuck extends Duck{
	public RedheadDuck() {
		cryBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	//RedhaedDuck �����ڿ��� 
	//cry�� fly�� �ൿ�� ����.
	//����� �������� �������̽� ��ü�� ���۷��� ��ȯ�� ����
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is RedhaedDuck!");
	}
	
}