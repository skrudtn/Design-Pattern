package Duck;

public class MallardDuck extends Duck{

	public MallardDuck() {
		cryBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	//MallardDuck �����ڿ��� 
	//cryBehavior�� flyBehavior�� �ൿ�� ����.
	//����� �������� �������̽� ��ü�� ���۷��� ��ȯ�� ����
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is MallardDuck!");
	}
	
}