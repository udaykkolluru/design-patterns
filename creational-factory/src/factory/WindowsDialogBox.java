package factory;

import buttons.IButton;
import buttons.WindowsButton;

public class WindowsDialogBox extends DialogBox {

	@Override
	public IButton createAndGetButton() {
		System.out.println("created Windows button");
		return new WindowsButton();
	}

}
