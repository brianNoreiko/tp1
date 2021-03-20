package models;

import interfaces.Drink;
import interfaces.Pee;

public class Viking extends Human implements Drink, Pee {
   private int bebedorProfesional;

   public Viking(String name, int age, int weigth, int totalEndurance, Drink drink, Pee pee, int bebedorProf) {
      super(name, age, weigth, totalEndurance, drink, pee);
      this.bebedorProfesional = bebedorProf;
   }

   public int getBebedorProfesional() {
      return bebedorProfesional;
   }

   public void setBebedorProfesional(int bebedorProfesional) {
      this.bebedorProfesional = bebedorProfesional;
   }

   @Override
   public Integer drink() {
      return drink.drink();

   }

   @Override
   public void pee() {
      pee.pee();
   }

   @Override
   public String toString() {
      return "Viking{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", weigth=" + weigth +
              ", totalEndurance=" + totalEndurance +
              ", drink=" + drink +
              ", pee=" + pee +
              ", enduranceLeft=" + enduranceLeft +
              ", bebedorProfesional=" + bebedorProfesional +
              '}';
   }
}
