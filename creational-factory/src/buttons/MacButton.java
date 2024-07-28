package buttons;

//concrete product
public class MacButton implements IButton{

	public void render() {
		System.out.println("Mac button rendering");
		onClick();
	}

	public void onClick() {
		System.out.println("Mac button clicked");
		
	}

}
