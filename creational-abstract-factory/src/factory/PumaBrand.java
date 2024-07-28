package factory;

import product.IShirt;
import product.IShoe;
import product.PumaShirt;
import product.PumaShoe;

public class PumaBrand implements ISportBrandFactory{

	public IShirt makeIShirt() {
		// TODO Auto-generated method stub
		return new PumaShirt();
	}

	public IShoe makeIShoe() {
		// TODO Auto-generated method stub
		return new PumaShoe();
	}

}
