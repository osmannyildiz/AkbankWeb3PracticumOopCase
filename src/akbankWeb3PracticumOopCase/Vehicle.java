package akbankWeb3PracticumOopCase;

import java.time.LocalDateTime;

public class Vehicle {
	
	private String hgsNumber;
	private String ownerName;
	private String ownerSurname;
	private VehicleClass vehicleClass;
	private LocalDateTime lastPassed;
	private double balance;
	
	public Vehicle(
		String hgsNumber,
		String ownerName,
		String ownerSurname,
		VehicleClass vehicleClass,
		LocalDateTime lastPassed,
		double balance
	) {
		this.hgsNumber = hgsNumber;
		this.ownerName = ownerName;
		this.ownerSurname = ownerSurname;
		this.vehicleClass = vehicleClass;
		this.lastPassed = lastPassed;
		this.balance = balance;
	}

	public String getHgsNumber() {
		return hgsNumber;
	}

	public void setHgsNumber(String hgsNumber) {
		this.hgsNumber = hgsNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerSurname() {
		return ownerSurname;
	}

	public void setOwnerSurname(String ownerSurname) {
		this.ownerSurname = ownerSurname;
	}

	public VehicleClass getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(VehicleClass vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public LocalDateTime getLastPassed() {
		return lastPassed;
	}

	public void setLastPassed(LocalDateTime lastPassed) {
		this.lastPassed = lastPassed;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
