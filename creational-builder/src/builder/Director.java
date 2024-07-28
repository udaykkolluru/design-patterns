package builder;

public class Director {

	public Director() {

	}

	public House buildIglooHouse(IBuilder iBuilder) {
		House house = iBuilder.setDoors(2).setType("snow").setWindows(5).buildHouse();
		return house;
	}

	public House buildWoodenHouse(IBuilder iBuilder) {
		House house = iBuilder.setDoors(7).setType("wood").setWindows(2).buildHouse();
		return house;
	}

}
