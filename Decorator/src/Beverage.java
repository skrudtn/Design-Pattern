import java.util.*;

public abstract class Beverage {
	protected String description = "�������";
	protected double cost ;
	
	public Beverage() {
		cost = 0;
	}
	
	public String getDescription() {
		return description;
	}
	public abstract double cost();
	
}
