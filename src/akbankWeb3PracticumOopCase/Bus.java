package akbankWeb3PracticumOopCase;

import java.time.LocalDateTime;

public class Bus extends Vehicle {
	
	public Bus(
		String hgsNumber,
		String ownerName,
		String ownerSurname,
		LocalDateTime lastPassed,
		double balance
	) {
		super(hgsNumber, ownerName, ownerSurname, VehicleClass.THIRD_CLASS, lastPassed, balance);
	}

}
