package models;

import interfaces.Drink;
import interfaces.Pee;

public abstract class Human implements Drink, Pee, Comparable<Human>{

    protected String name;
    protected int age;
    protected int weigth;
    protected int totalEndurance;
    protected Drink drink;
    protected Pee pee;
    protected int enduranceLeft; // When enduranceLeft become 0 or less than 0, the subjet need to pee
    //protected int beerConsumed;



    public Human(String name, int age, int weigth, Drink drink, Pee pee) {
        this.name = name;
        this.age = age;
        this.weigth = weigth; //expressed in kg.
        this.totalEndurance = 100; //hardcoded couse it's a base stat for all Humans
        this.enduranceLeft = enduranceLeft;
        this.drink = drink;
        this.pee = pee;
        //this.beerConsumed = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getTotalEndurance() {
        return totalEndurance;
    }

    public void setTotalEndurance(int totalEndurance) {
        this.totalEndurance = totalEndurance;
    }

    public void setEnduranceLeft(int enduranceLeft) {
        this.enduranceLeft = enduranceLeft;
    }

    public int getEnduranceLeft() {
        return this.enduranceLeft;
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

    @Override
    public int compareTo(Human o) {
        if(age < o.age){
            return -1;
        }
        if(age > o.age){
            return 1;
        }
        return 0;
    }
}
