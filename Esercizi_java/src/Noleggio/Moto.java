package Noleggio;
/*
 * ISTRUZIONI D'ESAME:
 * 
 * - targa
 * - anno 1800<n<2023
 * 
 * 
 * */
public class Moto extends Veicolo {
	Moto(int nPasseggeri, String nModello,  int nAnno) {
		super.cVeicolo( nModello, nAnno);
		//specifica passeggeri
		if(nPasseggeri < 1 || nPasseggeri > 2)
			this.passeggeri = 1;
		else
			this.passeggeri = nPasseggeri;
	}

}
