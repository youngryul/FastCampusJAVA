package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {

		
		CarFactory factory = CarFactory.getInstance();
		Car mysonata = factory.createCar();
		Car yoursonata = factory.createCar();
		
		System.out.println(mysonata.getCarNum());
		System.out.println(yoursonata.getCarNum());
	}

}
