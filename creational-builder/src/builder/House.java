package builder;

public class House {
	int doors;
	String type;
	int windows;
	
	public House(int doors, String type, int windows) {
		super();
		this.doors = doors;
		this.type = type;
		this.windows = windows;
	}
	
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}

	@Override
	public String toString() {
		return "House [doors=" + doors + ", type=" + type + ", windows=" + windows + "]";
	}
	
	
}
