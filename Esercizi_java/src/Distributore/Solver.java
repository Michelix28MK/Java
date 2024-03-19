package Distributore;
import java.util.Scanner;

//FORMATO INPUT
/*
	B coca 10 10
	B cocagrande 15 30
	B cocamedia 10 15
	M fiestaa 10 20
	M duplo 5 10
	M crackers 5 6
	CB 1
	S 14
	CB 1
	CM 5
	CM 10
	S 20
	CM 10
	CB 1
	S 10
	CM 10
	F
 */
public class Solver {
    public static void main(String args[]){
    	//oggetti
        Scanner sc = new Scanner(System.in);
        Bevanda b;
        Merendina m;
        Macchinetta m1 = new Macchinetta();
        //argomenti
        int soldi = 0;
        String tipo;
        String nome;
        int costo;
        int volume;
        int calorie;
        int money;
        
        System.out.println("\nComando: ");
    	tipo = sc.next();
        while(!tipo.equals("F")) {//finche il comando non è F
        	
        	switch(tipo) {
        		case "B":
        			/*BEVANDA*/
        			//rileva parametri
        			nome = sc.next();
        			costo = sc.nextInt();
        			volume = sc.nextInt();
        			//crea oggetto e imposta
        			b = new Bevanda(volume);
        			b.setNome(nome);
        			b.setCosto(costo);
        			//aggiungi al distributore
        			m1.aggiungiProdotto(b);
        			break;
        		case "CB":
        			volume = sc.nextInt();
        			b = m1.compraBevanda(soldi, volume);
        			System.out.println("\nHo acquistato: " + b);
        			break;
        		case "M":
        			/*MERENDINA*/
        			//rileva parametri
        			nome = sc.next();
        			costo = sc.nextInt();
        			calorie = sc.nextInt();
        			//crea oggetto e imposta
        			m = new Merendina(calorie);
        			m.setNome(nome);
        			m.setCosto(costo);
        			//aggiungi al distributore
        			m1.aggiungiProdotto(m);
        			break;
        		case "CM":
        			calorie = sc.nextInt();
        			m = m1.compraMerendina(soldi, calorie);
        			System.out.println("\nHo mangiato: " + m);
        			break;
        		case "S":
        			/*SOLDI*/
        			money = sc.nextInt();
        			if(money < 0)
        				System.out.println("\nNumero di soldi non valido.");
        			else {
        				soldi += money;
        				System.out.println("\nTransazioone eseguita");
        				}
        			break;
        		default:
        			System.out.println("\nComando errato ri tentare\n\n");
        			break;
        	}
        	System.out.println("\nComando: ");
        	sc.next();
        }
        System.out.println("\nTerminazione esecuzione in corso...");
        sc.close();
        System.out.println("\n\nTERMINATO");
    	}
        
  
	}
