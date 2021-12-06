//controller layer
package com.proj.chemistshop;

import java.util.Date;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Acephen acephen = new Acephen();
		acephen.mfgDate = new Date("22/10/2024");
		acephen.expiryDate = new Date("22/10/2024");
		Aspirin asprin = new Aspirin();
		asprin.mfgDate = new Date("25/02/2032");
		asprin.expiryDate = new Date("01/10/2035");
		Cipro cipro = new Cipro();
		cipro.mfgDate = new Date("01/10/2024");
		cipro.expiryDate = new Date("22/10/2026");
		Crocin crocin = new Crocin();
		crocin.mfgDate = new Date("22/10/2024");
		crocin.expiryDate = new Date("22/10/2024");
		Disprin disprin = new Disprin();
		disprin.mfgDate = new Date("22/10/2026");
		disprin.expiryDate = new Date("22/10/2030");
		Netrumur netrumur = new Netrumur();
		netrumur.mfgDate = new Date("22/10/2026");
		netrumur.expiryDate = new Date("22/10/2030");

		MedicineStore medicineStore = new MedicineStore();
		medicineStore.add(acephen);
		medicineStore.add(asprin);
		medicineStore.add(cipro);
		medicineStore.add(disprin);
		medicineStore.add(crocin);
		medicineStore.add(netrumur);
		
		UserInterface userInterface = new UserInterface();
		List medicineList = medicineStore.getMedicineList();
		userInterface.print(medicineList);
		
		medicineStore.remove(acephen);
		medicineStore.remove(asprin);
		
			System.out.println("Printing after removal");
			userInterface.print(medicineList);
			System.out.println("Printing Homopathy");
			userInterface.printAllHomopathy(medicineList);
			System.out.println("Printing Allopathy");
			userInterface.printAllAllopathy(medicineList);
			System.out.println("Printing Ayurvedic");
			userInterface.printAllAyurvedic(medicineList);
			System.out.println("Printing Unani");
			userInterface.printAllUnani(medicineList);
	}

}
