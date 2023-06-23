package Persoane;

import java.util.ArrayList;

public class Manager extends Personal{

	private ArrayList<Muncitor> listaMuncitori;
	
	public Manager(String nume, String prenume, String functie, int aniVechime, double valoareNumerica) {
		super(nume, prenume, functie, aniVechime, valoareNumerica);
		listaMuncitori = new ArrayList<Muncitor>();
	}

	public void adauga(Muncitor m) {
		listaMuncitori.add(m);
	}
	
	public void afiseazaSubordonati() {
		for(Muncitor m : listaMuncitori) {
			System.out.println(m);
		}
	}

	public ArrayList<Muncitor> getListaMuncitori() {
		return listaMuncitori;
	}
}
