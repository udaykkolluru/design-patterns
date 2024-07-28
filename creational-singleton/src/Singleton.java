
public class Singleton {
	private static Singleton singletonInstance;
	private String data;
	private Singleton(String data) {
		this.data = data;
	}
	
	public static Singleton getSingletonInstance(String val) {
		if(singletonInstance == null) {
			singletonInstance = new Singleton(val);
		}
		return singletonInstance;
	}

	public String getData() {
		return data;
	}
	
}
