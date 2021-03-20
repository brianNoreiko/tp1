package Impl;

import interfaces.Drink;

public class vikingDrinkImpl implements Drink {
    @Override
        public Integer drink() {
            System.out.println("Vikingo Bebiendo...");
            return (int) Math.random()*10+10;
        }

    }
