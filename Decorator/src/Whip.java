
public class Whip extends CondimentDecorator{
	private Beverage beverage;
	
	public Whip(Beverage b) {
		this.beverage = b;
	}
	public String getDescription() {
		return "»÷«Œ "+beverage.getDescription();
	}

	public double cost() {
		return 1500+beverage.cost();
	}
}
