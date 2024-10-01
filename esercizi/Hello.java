import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //definisco e creo l' oggetto di input

        System.out.println("Hello, word!"); //stampa e va a capo
        System.out.print("Hello, World");   //stampa e basta
        System.out.printf("Hello, %s! \n", "World"); //stampa con formattazione

        System.out.println("inserisci un intero: ");
        int i = scan.nextInt();
        System.out.printf("Hai inserito, %d.\n", i);
        scan.close();
    }
}