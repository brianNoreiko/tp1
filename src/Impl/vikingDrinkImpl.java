package Impl;

import interfaces.Drink;

public class vikingDrinkImpl implements Drink {
    @Override
        public Integer drink() {
            System.out.println("Vikingo Bebiendo...");
            return (int) Math.random()*10+10; /* This int define how much endurance will be subtracts. That math calculation return a number
        between 10 and 20 but not including those*/
        }

    }
