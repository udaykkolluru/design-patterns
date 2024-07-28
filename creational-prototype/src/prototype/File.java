package prototype;

public class File implements Inode {
	private String name;

	public File(String name) {
		super();
		this.name = name;
	}

	@Override
	public void print(String indentation) {
		System.out.println(indentation + name);
	}

	public Inode clone() {
		return new File(name + "_clone");
	}

}
