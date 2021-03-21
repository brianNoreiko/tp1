package Impl;

import interfaces.Drink;

public class spartanDrinkImpl implements Drink {
    @Override
    public Integer drink() {
        System.out.println("Espartano Bebiendo...");
        return (int) Math.random() * 10 + 10; // This int define how much endurance will be subtracts
    }
}
