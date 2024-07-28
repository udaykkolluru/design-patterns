package builder;

public class SnowHouseBuilder implements IBuilder{
	
	int doors;
	String type;
	int windows;

	public IBuilder setDoors(int doors) {
		this.doors = doors;
		return this;
	}

	public IBuilder setType(String type) {
		this.type = type;
		return this;
	}

	public IBuilder setWindows(int windows) {
		this.windows = windows;
		return this;
	}

	public House buildHouse() {
		// TODO Auto-generated method stub
		return new House(doors, type, windows);
	}
	
}
