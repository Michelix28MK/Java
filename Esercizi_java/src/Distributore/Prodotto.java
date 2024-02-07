package Pacchetto;
public abstract class Prodotto{
    public int costo;
    public String nome;


    public Prodotto(String nome, int costo){
        this.costo = costo;
        this.nome = nome;
    }

    public Prodotto(){

    }

    public int getCosto(){
        return costo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCosto(int costo){
        this.costo = costo;
    }
}