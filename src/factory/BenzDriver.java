package factory;

public class BenzDriver implements Driver{

	@Override
	public Car driverCar() {
		return new BenzCar();
	}

}
