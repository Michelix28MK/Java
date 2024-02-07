package Lab9;

public class Vett extends Contatore{
	double x = 0;
	double y = 0;
//  metodi static
	static void equals(Object a, Object b) {
		if(a.getClass() == b.getClass())
			System.out.println("Gli oggetti sono dello stesso tipo");
		else
			System.out.println("\nSono oggetti di tipo diverso!");
	}
//informazioni vettore
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void getCoordinate() {
		System.out.println("Coordinate X: " + x + " Y: " + y);
	}
	public double getLunghezza() {
		double somma = Math.pow((this.x-this.a), 2.0)+ Math.pow((this.y-this.b), 2.0);
		double distanza = Math.pow(somma, 0.5);
		//System.out.println("Lunghezza: " + distanza);
		return distanza;
	}
	
	public void info(){
		System.out.println("\nOrigine: ("+a+";"+b+")\nTesta: ("+x+";"+y+")\nLunghezza :"+getLunghezza());
	}
//modifica valore
	protected void setCoordinate(int a) {
		x = a;
	}
	protected void setCoordinate(int a, int b) {
		this.x = a;
		this.y = b;
	}
	protected void setCoordinate(float a) {
		x = a;
	}
	protected void setCoordinate(float a, float b) {
		this.x = a;
		this.y = b;
	}
	protected void setCoordinate(double a) {
		x = a;
	}
	protected void setCoordinate(double a, double b) {
		this.x = a;
		this.y = b;
	}
//operazioni vettoriali
	public void sommaVettori(Vett a, Vett b) {
		x = a.getX() + b.getX();
		y = a.getY() + b.getX();
	}
	public void differenzaVettori(Vett a, Vett b) {
		x = a.getX() - b.getX();
		y = a.getY() - b.getY();
	}
	void copiaVett(Vett a){
		this.a = a.a;
		this.b = a.b;
		this.x = a.x;
		this.y = a.y;
	}
}
