package decorator;

public abstract class PizzaDecorator implements IPizza {

	private final IPizza pizza;

	public PizzaDecorator(IPizza pizza) {
		this.pizza = pizza;
	}

	public int getPrice() {
		return pizza.getPrice();
	}

}
