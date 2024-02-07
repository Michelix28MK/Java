package Pacchetto;
public class Merendina extends Prodotto{
    int calorie;


    public Merendina(int calorie){
        super();
        this.calorie = calorie;
    }

    public int getCalorie(){
        return calorie;
    }

    public void setCalorie(int calorie){
        this.calorie = calorie;
    }
}
