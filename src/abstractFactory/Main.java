package abstractFactory;

public class Main {

	public static void main(String[] args) {
		// ����1����������ƷA1��B1
		Factory1 factory1 = new ConcreteFactory1();
		IProductA productA1 = factory1.getProductA1();
		IProductB productB1 = factory1.getProductB1();

		productA1.method();
		productB1.method();

		// ����2����������ƷA2��B2
		Factory2 factory2 = new ConcreteFactory2();
		IProductA productA2 = factory2.getProductA2();
		IProductB productB2 = factory2.getProductB2();

		productA2.method();
		productB2.method();
	}

}
