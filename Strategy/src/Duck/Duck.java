package Duck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	CryBehavior cryBehavior;
	//모든 Duck이 인터페이스의 레퍼런스를 가진다.
	
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
	//fly, cry행동을 직접 처리 하는게 아니라 인터페이스 객체에 위임.

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		// TODO Auto-generated method stub
		this.flyBehavior = flyBehavior;
	}
	
	public void setCryBehavior(CryBehavior cryBehavior) {
		// TODO Auto-generated method stub
		this.cryBehavior = cryBehavior;
	}
	//동적으로 행동을 바꾸기 위해 set함수를 선언하여 행동 인터페이스를 변환한다.
}

