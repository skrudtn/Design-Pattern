package Duck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	CryBehavior cryBehavior;
	//��� Duck�� �������̽��� ���۷����� ������.
	
	public void swim() {
		
	}
	public void display() {
		
	}
	
	public void perfromFly() {
		flyBehavior.fly();
	}
	public void perfromCry() {
		cryBehavior.cry();
	}
	//fly, cry�ൿ�� ���� ó�� �ϴ°� �ƴ϶� �������̽� ��ü�� ����.

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		// TODO Auto-generated method stub
		this.flyBehavior = flyBehavior;
	}
	
	public void setCryBehavior(CryBehavior cryBehavior) {
		// TODO Auto-generated method stub
		this.cryBehavior = cryBehavior;
	}
	//�������� �ൿ�� �ٲٱ� ���� set�Լ��� �����Ͽ� �ൿ �������̽��� ��ȯ�Ѵ�.
}

