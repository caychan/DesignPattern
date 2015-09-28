package factory;

public class Main {

	public static void main(String[] args) {
		Driver driver = new BenzDriver();
		Car car = driver.driverCar();
		car.drive();

	}

}
