package akbankWeb3PracticumOopCase;

public class Management {
	
	public void printRevenueOfBooth(HgsBooth hgsBooth) {
		double totalRevenue = 0;
		for (Vehicle vehicle : hgsBooth.getPassedVehicles()) {
			double passageFee = HgsBooth.passageFees.get(vehicle.getVehicleClass());
			totalRevenue += passageFee;
		}
		
		System.out.println("Total revenue: ₺" + totalRevenue);
	}

}
