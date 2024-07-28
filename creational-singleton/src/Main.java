
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getSingletonInstance("abcd");
		System.out.println(singleton.getData());
		Singleton singleton1 = Singleton.getSingletonInstance("abcsf");
		System.out.println(singleton1.getData());
	}

}
