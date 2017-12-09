
public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if(type.equals("pepperoni")){
			return new NYStylePepperoniPizza();
		}
		return null;
	}


}
