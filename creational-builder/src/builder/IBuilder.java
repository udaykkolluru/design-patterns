package builder;

public interface IBuilder {
	public IBuilder setDoors(int doors);
	public IBuilder setType(String type);
	public IBuilder setWindows(int windows);
	public House buildHouse();
}
