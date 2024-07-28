package decorator;

public class CheeseDecorator extends PizzaDecorator {

	public CheeseDecorator(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 3;
	}

}
