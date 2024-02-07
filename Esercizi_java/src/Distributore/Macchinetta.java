package Pacchetto;
import java.util.*;

public class Macchinetta{
    private List<Prodotto> prodotti;

    public Macchinetta(){
        prodotti = new ArrayList<>();
    }

    void aggiungiProdotto(Prodotto p){
        prodotti.add(p);
    }

    void aggiungiProdotto(){

    }

    public Merendina getLast(){
        return (Merendina) prodotti.get(prodotti.size()-1);
    }

    public Merendina compraMerendina(int soldi, int calorie){
        Prodotto p = null;
        Merendina m = null;
        int i;
        boolean exit = false;

        for(i=0; i<prodotti.size() && !exit; i++){
            p = prodotti.get(i);
            if(p instanceof Merendina){
                m = (Merendina) p;
                if((m.getCosto()) <= soldi && m.getCalorie() <= calorie){
                    exit = true;
                }
            }
        }
        return m;
    }

    public Bevanda compraBevanda(int soldi, int volume){
        Prodotto p = null;
        Bevanda b = null;
        int i;
        boolean exit = false;

        for(i=0; i<prodotti.size() && !exit; i++){
            p = prodotti.get(i);
            if(p instanceof Bevanda){
                b = (Bevanda) p;
                if((b.getCosto()) <= soldi && b.getVolume() <= volume){
                    exit = true;
                }
            }
        }
        return b;
    }
}