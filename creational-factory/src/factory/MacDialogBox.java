package factory;

import buttons.IButton;
import buttons.MacButton;

public class MacDialogBox extends DialogBox {
	@Override
	public IButton createAndGetButton() {
		// TODO Auto-generated method stub
		System.out.println("created mac button");
		return new MacButton();
	}

}
