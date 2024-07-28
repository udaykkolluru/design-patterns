package decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPizza iPizza = new PizzaBase();
		iPizza = new CheeseDecorator(iPizza);
		iPizza = new OnionDecorator(iPizza);
		System.out.println("Pizza price is $" + iPizza.getPrice());

	}

}
