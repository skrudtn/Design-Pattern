import java.util.ArrayList;

public class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings;
	
	
	public Pizza() {
		toppings = new ArrayList<>();
	}
	
	public void prepare() {
		System.out.format("Prepare %s", name);
		for(String topping : toppings) {
			System.out.format("Add topping %s\n", topping);
		}
	}
	
	public void cut() {
		
	}
	
	public void bake() {
		
	}
	
	public void box() {
		
	}
	
}
