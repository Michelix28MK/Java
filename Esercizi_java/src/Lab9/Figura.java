package Lab9;
import java.util.ArrayList;

public class Figura {
	ArrayList<Linea> oggettiL = new ArrayList<Linea>();
	ArrayList<Cerchio> oggettiC = new ArrayList<Cerchio>();
	int oggettiInseriti = 0;
	
	public void aggiungiFigura(Linea a) {
		oggettiL.add(a);
		oggettiInseriti++;
	}
	public void aggiungiFigura(Cerchio a) {
		oggettiC.add(a);
		oggettiInseriti++;
	}
	public void cancellaFigura() {
		oggettiC.clear();
		oggettiL.clear();
		oggettiInseriti = 0;
	}
	public void cerchiConcentrici() {
		boolean concentrici = false;
		for(Cerchio cerchi: oggettiC)
			for(Cerchio ass: oggettiC)
				if(cerchi != ass)
					concentrici = cerchi.isConcentric(ass);
		
		System.out.println("\n\nÉ "+concentrici+" che ci sono dei cerchi concentrici");
	}
	
	public void info() {
		System.out.println("\n\nLista degli oggetti inseriti: ");
		int n = 1;
		for(Cerchio oggetto: oggettiC) {
			System.out.println("\n"+ n + " Cerchio:");
			n++;
			oggetto.info();
		}
		
		n = 1;
		
		for(Linea oggetto: oggettiL) {
			System.out.println("\n"+ n + " Linea:");
			n++;
			oggetto.info();
		}
	}
	//metodi privati
}
