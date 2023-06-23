package Exceptii;

import Persoane.Angajat;

public class AngajatConcediat extends Exception {

	private Angajat angajat;
	
	public AngajatConcediat(Angajat angajat) {
		super("Angajatul: " + angajat + " a fost concediat!");
		this.angajat = angajat;
	}

	
}
