package akbankWeb3PracticumOopCase;

import java.time.LocalDateTime;

public class Car extends Vehicle {
	
	public Car(
		String hgsNumber,
		String ownerName,
		String ownerSurname,
		LocalDateTime lastPassed,
		double balance
	) {
		super(hgsNumber, ownerName, ownerSurname, VehicleClass.FIRST_CLASS, lastPassed, balance);
	}
	
}
