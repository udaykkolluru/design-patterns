package decorator;

public class OnionDecorator extends PizzaDecorator {

	public OnionDecorator(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int getPrice() {
		return super.getPrice() + 2;
	}

}
