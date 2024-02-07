package Noleggio;

import java.util.ArrayList;
/*
 * ISTRUZIONI D'ESAME:
 * 
 * - lista veicoli
 * - aggiungi veicolo()
 * - restituisci veicolo()
 * - noleggia auto()
 * - noleggia moto()
 * - sort anno()
 * - sort noleggi()
 * 
 * */
public class Noleggio {
	ArrayList<Veicolo> listaVeicoli = new ArrayList<Veicolo>();
	
	void aggiungiVeicolo(Veicolo a) {
		if(a.anno == 2023)//filtra per anno
			listaVeicoli.add(a);
		else
			System.out.println("Err: Veicolo immatricolato dopo 2023!");
	}
	void restituisciVeicolo(Veicolo a) {
		listaVeicoli.add(a);//aggiunge qualunque veicolo passato
	}
	Auto noleggiaAuto(int nPasseggeri, int anno) {
		/*
		 * - usare istanceof 
		 * - p >= passeggeri
		 * - a >= anno
		 * 
		 */
		
		Auto noleggiabile = null;
		
		for(Veicolo veicolo: listaVeicoli)
			if(veicolo instanceof Auto) //se il veicolo è un auto
				if(veicolo.passeggeri >= nPasseggeri && veicolo.anno >= anno) { //ed il veicolo ha i requisiti minimi
					noleggiabile = (Auto)veicolo; //downcasting e restituisci il veicolo
					noleggiabile.noleggio++;//incrementa conter noleggiato
					listaVeicoli.remove(veicolo);//rimuovi dalla lista
				}
		return noleggiabile;
	}
	Moto noleggiaMoto(int nPasseggeri, String modello) {
		/*
		 * - this.modello = modello
		 * - p >= passeggeri
		 * 
		 */
		Moto noleggiabile = null;
		
		for(Veicolo veicolo: listaVeicoli)
			if(veicolo instanceof Moto) //se il veicolo è una moto
				if(veicolo.passeggeri >= nPasseggeri && veicolo.modello == modello) { //ed il veicolo ha i requisiti minimi
					noleggiabile = (Moto)veicolo; //downcasting e restituisci il veicolo
					noleggiabile.noleggio++;//incrementa conter noleggiato
					listaVeicoli.remove(veicolo);//rimuovi dalla lista
				}
		return noleggiabile;
	}
	void sortAnno() {
		
		boolean flag = true;
		Veicolo supp;
		while(flag) {
			flag = false;
			for(Veicolo veicolo: listaVeicoli)
				for(Veicolo veicolo1: listaVeicoli)
					if(veicolo.anno < veicolo1.anno) {
						supp = veicolo;
						veicolo = veicolo1;
						veicolo1 = supp;
						flag = true;
					}
		}
		//fine sorting e print del risultato
		for (Veicolo veicolo: listaVeicoli)
			System.out.print(veicolo.toString());
	}
	void sortNoleggi() {
		boolean flag = true;
		Veicolo supp;
		while(flag) {
			flag = false;
			for(Veicolo veicolo: listaVeicoli)
				for(Veicolo veicolo1: listaVeicoli)
					if(veicolo.noleggio < veicolo1.noleggio) {
						supp = veicolo;
						veicolo = veicolo1;
						veicolo1 = supp;
						flag = true;
					}
		}
		//fine sorting e print del risultato
		for (Veicolo veicolo: listaVeicoli)
			System.out.print(veicolo.toString());
	}
}
