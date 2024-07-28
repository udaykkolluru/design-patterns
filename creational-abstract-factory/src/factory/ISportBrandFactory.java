package factory;

import product.IShirt;
import product.IShoe;

public interface ISportBrandFactory {
	IShirt makeIShirt();
	IShoe makeIShoe();
}
