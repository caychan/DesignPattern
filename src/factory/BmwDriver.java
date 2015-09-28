package factory;

public class BmwDriver implements Driver{

	@Override
	public Car driverCar() {
		return new BmwCar();
	}
	
	
}
