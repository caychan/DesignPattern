package abstractFactory;

class ConcreteFactory2 extends Factory2 {
	
	public IProductA getProductA2() {
		return new ProductA2();
	}

	public IProductB getProductB2() {
		return new ProductB2();
	}
}