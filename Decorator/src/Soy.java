
public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage b) {
		beverage = b;
	}
	public String getDescription() {
		return "���� "+beverage.getDescription();
	}

	public double cost() {
		return 2000+beverage.cost();
	}
}
