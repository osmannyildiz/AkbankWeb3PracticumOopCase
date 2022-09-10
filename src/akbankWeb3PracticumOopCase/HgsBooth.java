package akbankWeb3PracticumOopCase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HgsBooth {
	
	public static Map<VehicleClass, Double> passageFees;
	protected List<Vehicle> passedVehicles;
	
	static {
		passageFees = new HashMap<>();
		passageFees.put(VehicleClass.FIRST_CLASS, 8.25);
		passageFees.put(VehicleClass.SECOND_CLASS, 10.75);
		passageFees.put(VehicleClass.THIRD_CLASS, 23.25);
	}
	
	public HgsBooth() {
		this.passedVehicles = new ArrayList<>();
	}
	
	public void processPassage(Vehicle vehicle) {
		double passageFee = passageFees.get(vehicle.getVehicleClass());
		double newBalance = vehicle.getBalance() - passageFee;
		vehicle.setBalance(newBalance);
		vehicle.setLastPassed(LocalDateTime.now());
		passedVehicles.add(vehicle);
	}

	public List<Vehicle> getPassedVehicles() {
		return passedVehicles;
	}

}
