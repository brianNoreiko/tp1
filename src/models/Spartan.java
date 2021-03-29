package models;

import interfaces.Drink;
import interfaces.Pee;

public class Spartan extends Human implements Drink, Pee {

    private int extraTolerance;

    public Spartan(String name, int age, int weigth, Drink drink, Pee pee) {
        super(name, age, weigth, drink, pee);
        this.extraTolerance = (int) ((int) age*0.8);
        this.setEnduranceLeft(this.totalEndurance + this.extraTolerance);/*Depends how old is the Spartan, gains "extraTolerance". This stat
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
                ", extra Tolerance=" + extraTolerance +
                '}';
    }

    @Override
    public Integer drink() {
        return drink.drink();
    }

    @Override
    public void pee() {
        pee.pee();
    }

    /*@Override
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
                            "Spartan N° " + i + 1,
                            getRandom(18,90), // Allowed age
                            getRandom(50,160), // Allowed weight
                            new spartanDrinkImpl(),
                            new spartanPeeImpl()
                    )
            );
        }
        return (ArrayList) spartanList;
    }*/



}
