package abstractFactory;

class ConcreteFactory1 extends Factory1 {
	
	public IProductA getProductA1() {
		return new ProductA1();
	}

	public IProductB getProductB1() {
		return new ProductB1();
	}
}