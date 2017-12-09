package Duck;

public class RedheadDuck extends Duck{
	public RedheadDuck() {
		cryBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	//RedhaedDuck 생성자에서 
	//cry와 fly의 행동을 지정.
	//실행시 동적으로 인터페이스 객체의 레퍼런스 변환이 가능
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is RedhaedDuck!");
	}
	
}