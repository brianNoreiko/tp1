package models;

import interfaces.Drink;
import interfaces.Pee;

public class Spartan extends Human implements Drink, Pee{

    private int toleranciaExtra;

    public Spartan(String name, int age, int weigth, int totalEndurance, Drink drink, Pee pee, int toleranciaExtra) {
        super(name, age, weigth, totalEndurance, drink, pee);
        this.toleranciaExtra = toleranciaExtra;
    }

    public int getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(int toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", totalEndurance=" + totalEndurance +
                ", drink=" + drink +
                ", pee=" + pee +
                ", enduranceLeft=" + enduranceLeft +
                ", toleranciaExtra=" + toleranciaExtra +
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
}
