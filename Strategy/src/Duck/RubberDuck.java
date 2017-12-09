package Duck;

public class RubberDuck extends Duck{
	public RubberDuck() {
		cryBehavior = new MuteQuack();
		flyBehavior = new FlyWithWings();
	}
	//RubberDuck 생성자에서
	//cry, fly의 행동을 지정.
	//실행시 동적으로 인터페이스 객체의 레퍼런스 변환이 가능
	
	public void display() {
		System.out.println("This is Rubber Duck!");
	}
}
