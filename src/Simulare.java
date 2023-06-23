import Persoane.*;
import Documente.*;
import Fabrica.*;
import Exceptii.*;

public class Simulare {

	public static void main(String[] args) throws AngajatConcediat {
		
		Fabrica fabrica = new Fabrica();

        Angajat angajat = new Angajat("Popescu", "Ion"," angajat ", 5, 10);
 
        Muncitor muncitor = new Muncitor("Ionescu", "Maria"," muncitor ", 3, 20);
 
        Manager manager = new Manager("Popa", "Alex"," manager ", 7, 20);
       
        Client client1 = new Client("Smith");
        
        System.out.println(angajat.afisareSalariu());
        System.out.println(angajat);
        System.out.println(muncitor.afisareSalariu());
        System.out.println(muncitor);
        muncitor.adaugaResponsabilitate("Tunde iarba");
        muncitor.afisareResponsabilitati();
        manager.adauga(muncitor);
        System.out.println();
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
