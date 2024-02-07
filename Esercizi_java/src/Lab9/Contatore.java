package Lab9;

public class Contatore {
	double a;
	double b;
	
	Contatore () {
		//origine
	a = 0;
	b = 0;
	}
	void setOrigine (double a){
	this.a = a ; 
	}
	void setOrigine(double a, double b) {
		this.a = a;
		this.b = b;
	}
	void getOrigine () {
	System.out.println("Origine: ("+a+";"+b+")");
	}
	void reset ( ) {
	a=0; }
}
