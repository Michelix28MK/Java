package Pacchetto;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Solver {
    public static void main(String args[]){
        File f = new File(args[0]);

        Scanner sc;
        int soldi = 0;
        String tipo;
        String nome;
        int costo;
        int volume;
        int calorie;
        int money;

        Macchinetta m1 = new Macchinetta();

        try{
            sc = new Scanner(f);
            tipo = sc.next();
            while(!tipo.equals("F")){
                if(tipo.equals("B")){
                    //BEVANDA
                    nome = sc.next();
                    costo = sc.nextInt();
                    volume = sc.nextInt();
    
                    Bevanda b = new Bevanda(volume);
                    b.setCosto(costo);
                    b.setNome(nome);
    
                    m1.aggiungiProdotto((Prodotto)b);
    
                }else if(tipo.equals("M")){
                    //MERENDINA
                    Merendina m;
    
                    nome = sc.next();
                    costo = sc.nextInt();
                    calorie = sc.nextInt();
    
                    m1.aggiungiProdotto();
                    m = m1.getLast();
                    m.setCosto(costo);
                    m.setNome(nome);
                    m.setCalorie(calorie);
    
                }else if(tipo.equals("S")){
                    //SOLDI
                    money = sc.nextInt();
                    if(money < 0){
                        throw new IllegalArgumentException("Inserisci un numero >= 0");
                    }else{
                        soldi += money;
                    }
    
                }else if(tipo.equals("CB")){
                    //COMPRA BEVANDA
                    Bevanda b;
                    volume = sc.nextInt();
                    b = m1.compraBevanda(soldi, volume);
                    System.out.println("Ho bevuto: " + b.getNome());
    
                }else if(tipo.equals("CM")){
                    //COMPRA MERENDINA
                    Merendina m;
                    calorie = sc.nextInt();
                    m = m1.compraMerendina(soldi, calorie);
                    System.out.println("Ho mangiato: " + m.getNome());
                }
                tipo = sc.next();
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.err.println("ERRORE FILE NON TROVATO");
        }
    }



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

    
}
