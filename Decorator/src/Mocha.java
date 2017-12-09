
public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage b) {
		this.beverage = b;
	}

	public double cost() {
		
		return 1500+beverage.cost();
		
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "¸ğÄ« "+ beverage.getDescription();
	}
	

}
