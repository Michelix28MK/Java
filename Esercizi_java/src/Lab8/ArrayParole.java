package Lab8;
public class ArrayParole {
	//variabili
	String[] ArrayStringhe = new String[100]; //lista parole
	int parole = 0; //contatore
	int index = 0;
	
//funzioni di classe
	static public void cancella(ArrayParole a) {
		
		for(;a.rimuoviParola() != null;);

		System.out.println("Array svuotato...");
	}
//funzioni dei singoli oggetti
	public int inserisciParola(String st) {
		if(parole >= 100)
			return -1; //array pieno
		
		st.trim(); //cancellazione spazi
		ArrayStringhe[parole] = st;
		parole++;
		
		if((ArrayStringhe[parole-1] == null) || (ArrayStringhe[parole-1] == "")) {
			parole--;
			return -1; //se il caricamento non va a buon fine
		}
		else
			return parole;
	}
	
	public String rimuoviParola() {
		String parola = null;
		
		if(parole < 1) {
			System.out.println("Array vuoto");
		}else {
			parole--;
			parola = ArrayStringhe[parole];
			ArrayStringhe[parole] = "";
		}
		
		return parola;
	}
	
	public void unisci(ArrayParole a, ArrayParole b) {
		
		if((a.getParole()+b.getParole()) > 100){
			
			System.out.println("Gli array sono troppo grandi per essere uniti!...");
			
		}else {
			//inserisco tutte le parole del primo array 
			String parola = a.lettore();
			for(;parola != null;) {
				ArrayStringhe[parole] = parola;
				parole++;
				parola = a.lettore();
			}
			//inserisco le parole del secondo vettore
			parola = b.lettore();
			for(;parola != null;) {
				ArrayStringhe[parole] = parola;
				parole++;
				parola = b.lettore();
			}
			System.out.println("Processo terminato!...");
		}
	}
	//funzione fantoccio
	public void ribalta() { 
		int passaggi = -1;//inizializazione della funzione ricorsiva
		passaggi = ribalta(passaggi);
		
		while(passaggi != 0)
			passaggi = ribalta(passaggi);
		ripetizione(); //reset indice
		System.out.println("Ribaltamento terminato...");
	}
	//funzione ricorsiva
	private int ribalta(int a) { 
		String assistente = null;
		if(a == -1)
			return (parole/2-index);
		else {
			//inversione delle parole
			assistente = ArrayStringhe[index];
			ArrayStringhe[index] = ArrayStringhe[parole - index];
			ArrayStringhe[parole - index] = assistente;
			
			return a-1;
		}
	}
//funzione di assistenza alla lettura degli array
	private void ripetizione() {
		index = 0;
		System.out.println("Indice di lettura resettato...");
	}
	public int getParole() {
		return parole;
	}
	//funzione di lettura
	public String lettore() {
		String parola = null;
		
		if(index < parole) {
			parola = ArrayStringhe[index];
			index++;
		}else
			ripetizione();
		return parola;
	}
}