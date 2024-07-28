package factory;

import buttons.IButton;

public abstract class DialogBox {
	public void renderWindow() {
		IButton btn = createAndGetButton();
		btn.render();
	}
	abstract IButton createAndGetButton();
}
