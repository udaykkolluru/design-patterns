package factory;

import product.IShirt;
import product.IShoe;

public class Main {

	public static void main(String[] args) {
		ISportBrandFactory factory = new NikeBrand();
		IShirt nikeIShirt = factory.makeIShirt();
		nikeIShirt.makeShirt();
		IShoe nikeIShoe = factory.makeIShoe();
		nikeIShoe.makeShoe();
		System.out.println("-------------------");
		factory = new PumaBrand();
		IShirt pumaIShirt = factory.makeIShirt();
		pumaIShirt.makeShirt();
		IShoe pumaIShoe = factory.makeIShoe();
		pumaIShoe.makeShoe();
	}

}
