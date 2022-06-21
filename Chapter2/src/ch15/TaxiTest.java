package ch15;

public class TaxiTest {

	public static void main(String[] args) {

		Person person = new Person("Edward", 30000);
		
		Taxi taxi = new Taxi("잘나간다 운수");
		
		person.takeTaxi(taxi);
		
		person.showInfo();
		taxi.showTaxiInfo();
		
	}

}
