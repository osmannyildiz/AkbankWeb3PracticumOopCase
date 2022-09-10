package akbankWeb3PracticumOopCase;

public class Main {

	public static void main(String[] args) {
		Vehicle veh1 = new Car("HGS67867867", "Halit", "Öztekin", null, 90.85);
		Vehicle veh2 = new Bus("HGS12312312", "Ayşe", "Kahraman", null, 147.15);
		Vehicle veh3 = new Van("HGS12312312", "Deniz", "Yılmaz", null, 66.90);
		HgsBooth hgsBooth = new HgsBooth();
		Management management = new Management();
		
		hgsBooth.processPassage(veh1);	// + ₺8,25
		hgsBooth.processPassage(veh2);	// + ₺23,25
		hgsBooth.processPassage(veh3);	// + ₺10,75
		hgsBooth.processPassage(veh1);	// + ₺8,25
		hgsBooth.processPassage(veh2);	// + ₺23,25
		hgsBooth.processPassage(veh3);	// + ₺10,75
		hgsBooth.processPassage(veh1);	// + ₺8,25
		hgsBooth.processPassage(veh2);	// + ₺23,25
		hgsBooth.processPassage(veh1);	// + ₺8,25
		
		// Toplam hasılat ₺124,25 olmalı
		management.printRevenueOfBooth(hgsBooth);
	}

}
