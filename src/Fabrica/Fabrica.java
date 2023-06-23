package Fabrica;

import java.util.ArrayList;

import Documente.Act;
import Documente.FluturasSalar;
import Documente.Oferta;
import Exceptii.AngajatConcediat;
import Persoane.Angajat;
import Persoane.Client;
import Persoane.Personal;

public class Fabrica {
	
	private ArrayList<Personal> listaAngajati;
	private ArrayList<Client> listaClienti;
	private ArrayList listaActe;
	
	public Fabrica() {
		listaAngajati = new ArrayList<Personal>();
		listaClienti = new ArrayList<Client>();
		listaActe = new ArrayList();
	}
	
	public void adaugareAngajat(Angajat a) {
		listaAngajati.add(a);
	}
	
	public void concediazaAngajat(Angajat a) {
		listaAngajati.remove(a);
	}
	
	public void afiseazaAngajati() {
		for(Personal a : listaAngajati) {
			System.out.println(a);
		}
	}
	
	public void adaugareClient(Client c) {
		listaClienti.add(c);
	}
	
	public void afiseazaClienti() {
		for(Client c : listaClienti) {
			System.out.println(c);
		}
	}
	
	public void generareContract(double valoareTotala, Client client) {
		Oferta oferta = new Oferta(valoareTotala, client);
		listaActe.add(oferta);
	}
	
	public void generareFluturas(double valoareSalariu, Angajat angajat) throws AngajatConcediat {
		if(!listaAngajati.contains(angajat)) {
			throw new AngajatConcediat(angajat);
		}
		
		FluturasSalar fluturasSalar = new FluturasSalar(valoareSalariu, angajat);
	    listaActe.add(fluturasSalar);
	    System.out.println("Tip: FluturasSalar, ID: " + fluturasSalar.getID() + ", Nume angajat: " + fluturasSalar.getAngajat().getNume());
	}
	
	public void afisareActeEmise() {
        System.out.println("Acte emise:");
        for (Object act : listaActe) {
            if (act instanceof Oferta) {
                Oferta oferta = (Oferta) act;
                System.out.println("Tip: Oferta, ID: " + oferta.getID() + ", Nume client: " + oferta.getClient().getNume());
            } else if (act instanceof FluturasSalar) {
                FluturasSalar fluturasSalar = (FluturasSalar) act;
                System.out.println("Tip: FluturasSalar, ID: " + fluturasSalar.getID() + ", Nume angajat: " + fluturasSalar.getAngajat().getNume());
            }
        }
    }
}
