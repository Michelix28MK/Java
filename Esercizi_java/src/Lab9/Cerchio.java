package Lab9;

public class Cerchio extends Vett{
	
	public double getAreaCerchio() {
		//System.out.println("Area: " + Math.PI*Math.pow(getLunghezza(), 2.0));
		//*pi*r^2
		return Math.PI*Math.pow(getLunghezza(), 2.0);
	}
	@Override
	public void info() {
		System.out.println("\nOrigine: ("+a+";"+b+")\nRaggio: "+x+"\nArea :"+getAreaCerchio());
	}
	public boolean isConcentric(Cerchio a) {
		if(this.a == a.a && this.b == a.b) {
			//System.out.println("\nI cerchi sono concentrici!");
			return true;
		}
		else {
			//System.out.println("\nCerchi non concentrici");
			return false;
		}
	}
	public void contains(Cerchio a) {
		//distanza dei centri < differenza raggi
		//r1≥r2+((x2−x1)^2+(y2−y1)^2)^0.5

		double quadratoDifferenzaX = Math.pow((this.a - a.a), 2.0);
		double quadratoDifferenzaY = Math.pow((this.b - a.b), 2.0);
		double distanzaCentri = Math.pow(quadratoDifferenzaX + quadratoDifferenzaY, 0.5);
		if(getLunghezza() >= distanzaCentri + a.getLunghezza())
			System.out.println("\nIl cerchio è contenuto!");
		else
			System.out.println("\nIl cerchio non è contenuto!");
	}
	void copiaCerchio(Cerchio a){
		this.a = a.a;
		this.b = a.b;
		this.x = a.x;
		this.y = a.y;
	}	
}
