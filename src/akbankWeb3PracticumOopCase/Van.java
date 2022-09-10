package akbankWeb3PracticumOopCase;

import java.time.LocalDateTime;

public class Van extends Vehicle {
	
	public Van(
		String hgsNumber,
		String ownerName,
		String ownerSurname,
		LocalDateTime lastPassed,
		double balance
	) {
		super(hgsNumber, ownerName, ownerSurname, VehicleClass.SECOND_CLASS, lastPassed, balance);
	}

}
