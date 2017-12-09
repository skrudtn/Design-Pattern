package Duck;

public class DuckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.perfromCry();
		mallardDuck.perfromFly();
		// This will invoke Class Quack, FlyWithWings
		
		Duck redheadDuck = new RedheadDuck();
		redheadDuck.perfromCry();
		redheadDuck.perfromFly();
		// This will invoke Class Quack, FlyNoWay
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.perfromCry();
		rubberDuck.perfromFly();
		// This will invoke Class MuteQuack, FlyWithWings
		
		Duck decoyDuck = new DecoyDuck();
		decoyDuck.perfromCry();
		decoyDuck.perfromFly();
		// This will invoke Class MuteQuack, FlyNoWay
		
		redheadDuck.setFlyBehavior(new InjuredFly());
		redheadDuck.perfromFly();
		redheadDuck.perfromCry();
		//redheadDuck 의 Fly행동을 InjuredFly로 교체하고 재실행.
		
	}

}
