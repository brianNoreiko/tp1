package models;

import Impl.vikingDrinkImpl;
import Impl.vikingPeeImpl;
import interfaces.Drink;
import interfaces.Pee;
import interfaces.extraMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Viking extends Human implements Drink, Pee, extraMethods {
   private int professionalDrinker;

   public Viking(String name, int age, int weigth, Drink drink, Pee pee) {
      super(name, age, weigth, drink, pee);
      /*this.professionalDrinker = (int)(int weigth * );*/ /*Todavía no se como definir esto. La idea es utilizar el peso
      para generar un número y que eso influya a través de "professionalDrinker" en el resultado del "totalEndurance" */
   }

   public int getProfessionalDrinker() {
      return professionalDrinker;
   }

   @Override
   public Integer drink() {
      Integer quantity  = drink.drink(); //Acá falta que afecte el "professionalDrinker"
      return subtractEndurance(quantity);

   }

   private Integer subtractEndurance(Integer quantity) {
   return  null; //Tengo que hacer esta funcion
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
              ", total Endurance=" + totalEndurance +
              ", drink=" + drink +
              ", pee=" + pee +
              ", endurance Left=" + enduranceLeft +
              ", Professional Drinker=" + professionalDrinker +
              '}';
   }


   @Override
   public Integer getRandom(int min, int max) {
      int i = ThreadLocalRandom.current().nextInt(min, max)+1;
      return i;
   }


   @Override
   public ArrayList generateTeam() {
      List<Viking> vikingList = new ArrayList<Viking>();
      for (int i=0; i<11; i++){
         vikingList.add(
                 new Viking(
                         "Viking N° " + i,
                         getRandom(18,90),
                         getRandom(50,160),
                         new vikingDrinkImpl(),
                         new vikingPeeImpl()
                 )
         );
      }
      return (ArrayList) vikingList;
   }
}

