import Persoane.*;
import Documente.*;
import Fabrica.*;
import Exceptii.*;

public class Simulare {

	public static void main(String[] args) throws AngajatConcediat {
		
		Fabrica fabrica = new Fabrica();

        Angajat angajat = new Angajat("Balla", "Janos"," angajat ", 5, 10);
 
        Muncitor muncitor = new Muncitor("Cotuna", "Calin"," muncitor ", 3, 20);
 
        Manager manager = new Manager("Ion", "Alex"," manager ", 8, 20);
       
        Client client1 = new Client("George");
        
        System.out.println(angajat.afisareSalariu());
        System.out.println(angajat);
        System.out.println(muncitor.afisareSalariu());
        System.out.println(muncitor);
        
        muncitor.adaugaResponsabilitate("Intretine spatiul");
        muncitor.afisareResponsabilitati();
        
        manager.adauga(muncitor);
        manager.afiseazaSubordonati();
        System.out.println(manager);
        
        fabrica.adaugareClient(client1);
        fabrica.afiseazaClienti();
        fabrica.generareContract(10, client1);
        fabrica.adaugareAngajat(angajat);
        fabrica.generareFluturas(40, angajat);
        
        fabrica.afisareActeEmise();
	}

}
