package buttons;

//concrete product
public class WindowsButton implements IButton{

	public void render() {
		System.out.println("Windows button rendering");
		onClick();
	}

	public void onClick() {
		System.out.println("Windows button clicked");
		
	}

}
