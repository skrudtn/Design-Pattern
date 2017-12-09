package Duck;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		cryBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	//DecoyDuck의 생성자에서
	//cry, fly행동을 지정.
	//실행시 동적으로 인터페이스 객체의 레퍼런스 변환이 가능
	public void display() {
		System.out.println("This is DecoyDuck!");
	}
}
