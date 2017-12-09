
public class Milk extends CondimentDecorator{
	Beverage beverage;
	
	public Milk(Beverage b) {
		beverage = b;
	}
	public String getDescription() {
		return "¿ìÀ¯ "+beverage.getDescription();
	}

	public double cost() {
		return 1000+beverage.cost();
	}

}
