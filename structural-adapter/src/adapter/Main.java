package adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnalyticsAdapter adapter = new AnalyticsAdapter();
		adapter.displayMenus(new XmlData());
		System.out.println("--");
		
		
		IRestaurant restaurant = new RestaurantUI();
		restaurant.displayMenus(new XmlData());

	}

}
