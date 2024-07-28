package builder;

public class Main {

	public static void main(String[] args) {
		IBuilder builder = new SnowHouseBuilder();
		Director director = new Director();
		House house1 = director.buildIglooHouse(builder);
		System.out.println(house1);
		
		House house2 = director.buildWoodenHouse(new WoodHouseBuilder());
		System.out.println(house2);
		
		
		
	}

}
