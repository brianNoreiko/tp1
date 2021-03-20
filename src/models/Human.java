package models;

import interfaces.Drink;
import interfaces.Pee;

public abstract class Human {

    protected String name;
    protected int age;
    protected int weigth;
    protected final int totalEndurance;

    {
        totalEndurance = 100; // base stat for all Humans
    }

    protected Drink drink;
    protected Pee pee;
    protected int enduranceLeft; // When enduranceLeft become 0, the subjet need to pee



    public Human(String name, int age, int weigth, Drink drink, Pee pee) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.drink  =drink;
        this.pee = pee;

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
