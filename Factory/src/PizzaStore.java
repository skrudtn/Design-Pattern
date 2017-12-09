/*
 	orderPizza() - 피자 주문이 들어오면 피자를 준다.
 	createPizza() - 
 */


public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	public abstract Pizza createPizza(String type);
}
