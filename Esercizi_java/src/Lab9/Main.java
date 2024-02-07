package Lab9;

public class Main {

	public static void main(String[] args) {
		Linea vettore1 = new Linea();
		Cerchio crc = new Cerchio();
		Cerchio crc1 = new Cerchio();
		Figura f = new Figura();
		
	
		System.out.println("\nCambio origigne vettore: (1;0)");
		vettore1.setOrigine(1.0);
		vettore1.getOrigine();
		System.out.println("Cambio coordinate vettore: (5;0)");
		vettore1.setCoordinate(5);
		vettore1.getCoordinate();
		vettore1.info();
		
		System.out.println("\ncontrollo diametro del cerchio...");
		crc.setCoordinate(5);
		crc.getAreaCerchio();
		
		crc1.setOrigine(1.0);
		crc1.setCoordinate(5);
		crc1.getAreaCerchio();
		
		f.aggiungiFigura(crc1);
		f.aggiungiFigura(vettore1);
		f.aggiungiFigura(crc);
		
		f.info();
		f.cerchiConcentrici();
	}

}
