package models;

import Impl.spartanDrinkImpl;
import Impl.spartanPeeImpl;
import interfaces.Drink;
import interfaces.Pee;
import interfaces.extraMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Spartan extends Human implements Drink, Pee, extraMethods {

    private int extraTolerance;

    public Spartan(String name, int age, int weigth, Drink drink, Pee pee) {
        super(name, age, weigth, drink, pee);
        this.extraTolerance = (int) ((int) age*0.8); /*Depends how old is the Spartan, gains "extraTolerance". This stat
        is an addition to totalEndurance*/
    }

    public int getExtraTolerance() {
        return extraTolerance;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", total Endurance=" + totalEndurance +
                ", drink=" + drink +
                ", pee=" + pee +
                ", endurance Left=" + enduranceLeft +
                ", extra Tolerance=" + extraTolerance +
                '}';
    }

    @Override
    public Integer drink() {
        return drink.drink(); //Acá falta que afecte el "extraTolerance"
    }

    @Override
    public void pee() {
        pee.pee();
    }

    @Override
    public Integer getRandom(int min, int max) {
        int i = ThreadLocalRandom.current().nextInt(min, max)+1;
        return i;
    }


    @Override
    public ArrayList generateTeam() {
        List<Spartan> spartanList = new ArrayList<Spartan>();
        for (int i=0; i<11; i++){
            spartanList.add(
                    new Spartan(
                            "Spartan N° " + i,
                            getRandom(18,90),
                            getRandom(50,160),
                            new spartanDrinkImpl(),
                            new spartanPeeImpl()
                    )
            );
        }
        return (ArrayList) spartanList;
    }
}
