package Persoane;

import java.util.ArrayList;

public class Muncitor extends Personal{

	private ArrayList<String> listaResponsabilitati;
	
	public Muncitor(String nume, String prenume, String functie, int aniVechime, double valoareNumerica) {
		super(nume, prenume, functie, aniVechime, valoareNumerica);
		listaResponsabilitati = new ArrayList<String>();
	}

	public void adaugaResponsabilitate(String responsabilitate) {
        listaResponsabilitati.add(responsabilitate);
    }

	public void afisareResponsabilitati() {
        System.out.println("Responsabilitati:");
        for (String responsabilitate : listaResponsabilitati) {
            System.out.println(" : " + responsabilitate);
        }
    }
}
