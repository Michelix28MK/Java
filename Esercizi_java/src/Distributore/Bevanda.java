package Distributore;
public class Bevanda extends Prodotto{
    int volume;

    public Bevanda(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }
}