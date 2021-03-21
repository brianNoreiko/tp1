package models;

import interfaces.Drink;
import interfaces.Pee;

public abstract class Human implements Drink, Pee{

    protected String name;
    protected int age;
    protected int weigth;
    protected int totalEndurance;
    protected Drink drink;
    protected Pee pee;
    protected int enduranceLeft; // When enduranceLeft become 0 or less than 0, the subjet need to pee
    protected int beerConsumed;



    public Human(String name, int age, int weigth, Drink drink, Pee pee) {
        this.name = name;
        this.age = age;
        this.weigth = weigth; //expressed in kg.
        this.totalEndurance = 100; //hardcoded couse it's a base stat for all Humans
        this.drink = drink;
        this.pee = pee;
        this.beerConsumed = 0;

    }

    public int getEnduranceLeft() {
        return totalEndurance - beerConsumed;
    }

    public int getBeerConsumed() {
        return beerConsumed;
    }

    public int addDrink(Integer drink){
        return this.beerConsumed += drink;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", totalEndurance=" + totalEndurance +
                ", drink=" + drink +
                ", pee=" + pee +
                ", enduranceLeft=" + enduranceLeft +
                '}';
    }
}
