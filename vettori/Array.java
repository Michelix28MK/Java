public class Array {
    public static void main(String[] args) {
        
        int[] numeri = new int[3]; //crea un nuovo array di lunghezza 3 di nome numeri

        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;

        System.out.println("lunghezza array: ");
        System.out.println(numeri.length); //visualizza la lunghezza della variabile "numeri"

        System.out.println("valore posizione '2' array: ");
        System.out.println(numeri[2]);  // visualizza valore

        System.out.println("valori array: ");

        for (int i = 0; i < numeri.length; i++) { // ciclo for
            System.out.println(numeri[i]);         
        }

        int[] numeri2 = {10, 20, 30, 40}; //dichiarazione array 2 versione

        System.out.println("lunghezza array 2: ");
        System.out.println(numeri2.length);

        System.out.println("valori array 2: ");

        for (int i : numeri2) { // ciclo for each
            System.out.println(i);          
        }
    }

}
