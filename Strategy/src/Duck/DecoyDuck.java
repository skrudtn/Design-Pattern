package Duck;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		cryBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	//DecoyDuck�� �����ڿ���
	//cry, fly�ൿ�� ����.
	//����� �������� �������̽� ��ü�� ���۷��� ��ȯ�� ����
	public void display() {
		System.out.println("This is DecoyDuck!");
	}
}
