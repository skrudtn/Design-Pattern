package Duck;

public class MallardDuck extends Duck{

	public MallardDuck() {
		cryBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	//MallardDuck 생성자에서 
	//cryBehavior와 flyBehavior의 행동을 지정.
	//실행시 동적으로 인터페이스 객체의 레퍼런스 변환이 가능
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is MallardDuck!");
	}
	
}