package models;

import interfaces.Drink;

public class spartanDrinkImpl implements Drink {
    @Override
    public void drink() {
        System.out.println("Bebiendo...");

    }
}
