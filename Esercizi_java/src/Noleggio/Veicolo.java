package Noleggio;

public abstract class Veicolo {
	//var
	static int targa = 0; //paramero  incrementale per le targhe dei veicoli
	int Mytarga;
	int passeggeri; //numero passeggeri
	int anno; //data di immatricolazione del mezzo
	int noleggio = 0;
	String modello; //titolo di ogni veicolo disponibile (singola parola)	
	
	void cVeicolo(String modello, int anno){//metodo unico completo
		
		this.modello = modello;
		//specifica parametri anni
		if(anno <1800 || anno>2023)
			this.anno = 2023;
		else
			this.anno = anno;
		//set targa
		this.Mytarga = Veicolo.targa;
		Veicolo.targa++;//inremento per il veicolo successivo
	}
	/*
	 
	void cVeicolo(String modello, int anno){//per moto
		this.modello = modello;
		//specifica parametri anni
		if(anno <1800 || anno>2023)
			this.anno = 2023;
		else
			this.anno = anno;
		//set targa
		this.Mytarga = Veicolo.targa;
		Veicolo.targa++;//inremento per il veicolo successivo
	}
	void cVeicolo(int passeggeri, int anno){//per auto
		this.passeggeri = passeggeri;
		//specifica parametri anni
		if(anno <1800 || anno>2023)
			this.anno = 2023;
		else
			this.anno = anno;
		//set targa
		this.Mytarga = Veicolo.targa;
		Veicolo.targa++;//inremento per il veicolo successivo
	}
	
	*/
	
	public String toString() {//passaggio informazioni
		return "\nINFO Veicolo:\nTarga: "+Mytarga+"\nImmatricolazione: "+anno+"\nModello: "+modello+"\nPasseggeri: "+passeggeri+"\nVolte noleggiato: "+noleggio+"\n\n";
	}
}
