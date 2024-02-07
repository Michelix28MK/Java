package Noleggio;

import java.util.Scanner;

public class Solver {
	
	/*
	 * ISTRUZIONI D'ESAME:
	 * 
	 * + noleggio
	 * - lettura istruzioni da stdin
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		Noleggio ng = new Noleggio();
		Scanner s = new Scanner(System.in);
		String comando;
		
		int passeggeri;
		String modello;
		int anno;
		
		char tipoVeicolo;
		
		Auto a = null;
		Moto m = null;
		
		/*
		 * - ADD nuovo veicolo + stampa
		 * - R restituzione veicoli + veicoli per numero noleggi
		 * - NAuto noleggio auto + stampa del veicolo noleggiabile / mezzo non disponibile
		 * - NMoto noleggio auto + stampa del veicolo noleggiabile / mezzo non disponibile
		 * - SNoleggio ordine per numero di noleggi
		 * - SAnno ordina per anno
		 * - END fine trasmissione 
		 */
		System.out.println("Inizio fase di lettura dei comandi:\n\n");
		//raccolta comando
		do {
			comando = s.next();
			switch(comando) {
				case "ADD":// va specificata la tipologia | ADD int Str int char
					System.out.println("Specifica i passeggeri: ");
					passeggeri = s.nextInt();
					System.out.println("Specifica il modello: ");
					modello = s.next();
					System.out.println("Specifica anno immatricolazione: ");
					anno = s.nextInt();
					System.out.println("Specifica tipologia veicolo (m/a): ");
					tipoVeicolo = s.next().charAt(0); //prende un singolo carattere
					if(tipoVeicolo == 'm') {
						m = new Moto(passeggeri, modello, anno);
						ng.aggiungiVeicolo((Veicolo)m);					
					}else if (tipoVeicolo == 'a'){
						a = new Auto(passeggeri, modello, anno);
						ng.aggiungiVeicolo((Veicolo)a);
					}
					System.out.println("Veicolo registrato con successo!\n");
					break;
				case "R":// va specificato la tipologia | R char
					tipoVeicolo = s.next().charAt(0);
					if(tipoVeicolo == 'm') {
						System.out.println("Restituzione di: " + m.toString());
						ng.restituisciVeicolo((Veicolo)m);					
					}else if (tipoVeicolo == 'a'){
						System.out.println("Restituzione di: " + a.toString());
						ng.restituisciVeicolo((Veicolo)a);
					}
					break;
				case "NAuto":// NAuto int int
					System.out.println("Specifica quanti passeggeri: ");
					passeggeri = s.nextInt();
					System.out.println("Specifica anno immatricolazione: ");
					anno = s.nextInt();
					a = ng.noleggiaAuto(passeggeri, anno);
					if(a != null)
						System.out.println(a.toString());
					else
						System.out.println("\nErr: mezzo non disponibile.");
				case "NMoto":// NMoto int Str
					System.out.println("Specifica quanti passeggeri: ");
					passeggeri = s.nextInt();
					System.out.println("Specifica modello: ");
					modello = s.next();
					m = ng.noleggiaMoto(passeggeri, modello);
					if(m != null)
						System.out.println(m.toString());
					else
						System.out.println("\nErr: mezzo non disponibile.");
					break;
				case "SAnno":// SAnno
					ng.sortAnno();
					break;
				case "SNoleggio":// ANoleggio
					ng.sortNoleggi();
					break;
			}
		}while(!comando.equalsIgnoreCase("END"));
		System.out.println("\nTerminazione eseguita!");
		s.close();
	}
}
