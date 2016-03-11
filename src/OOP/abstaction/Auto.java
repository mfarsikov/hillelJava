package OOP.abstaction;

/**
 * Created by MBCNEWMAIN on 11.03.2016.
 */
public abstract class Auto {

    int year;

    public Auto(int year){
        this.year = year;
    }

    public abstract String getMark();

    @Override
    public String toString(){
        return "Auto " + getMark() + ", year " + year;
    }

}
