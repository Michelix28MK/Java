package Noleggio;
/*
 * ISTRUZIONI D'ESAME:
 * 
 * - targa
 * - anno 1800<n<2023 d=2023
 * - passeggeri 2<n<8 d=5
 * 
 * */
public class Auto extends Veicolo{

	Auto(int nPasseggeri, String nModello, int nAnno) {
		super.cVeicolo(nModello, nAnno);
		if(nPasseggeri < 1 || nPasseggeri > 8)
			this.passeggeri = 5;
		else
			this.passeggeri = nPasseggeri;
	}
}
