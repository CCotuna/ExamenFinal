package Persoane;

public abstract class Personal {

	private String nume, prenume, functie;
	private int aniVechime;
	private double valoareNumerica;
	
	public Personal(String nume, String prenume, String functie ,int aniVechime, double valoareNumerica) {
		this.nume = nume;
		this.prenume = prenume;
		this.functie = functie;
		this.aniVechime = aniVechime;
		this.valoareNumerica = valoareNumerica;
	}
	
	
	public String getNume() {
		return nume;
	}


	public String getPrenume() {
		return prenume;
	}


	public String getFunctie() {
		return functie;
	}


	public String toString() {
		return nume + " " + prenume + "(" + functie + ")";
	}
	
	public double afisareSalariu() {
		return aniVechime * valoareNumerica;
	}
	
}
