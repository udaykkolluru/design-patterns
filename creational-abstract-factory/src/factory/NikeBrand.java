package factory;

import product.IShirt;
import product.IShoe;
import product.NikeShirt;
import product.NikeShoe;

public class NikeBrand implements ISportBrandFactory {

	public IShirt makeIShirt() {
		return new NikeShirt();
	}

	public IShoe makeIShoe() {
		return new NikeShoe();
	}

}
