package models;

import interfaces.Drink;
import interfaces.Pee;

public class Viking extends Human implements Drink, Pee {
   private int professionalDrinker;

   public Viking(String name, int age, int weigth, Drink drink, Pee pee) {
      super(name, age, weigth, drink, pee);
      this.professionalDrinker = 20; /* All the vikings have 20% alcohol tolerance. This means that beer only affect them
      by 80% on the total endurance*/
      this.setEnduranceLeft(this.totalEndurance);
   }



   public int getProfessionalDrinker() {
      return professionalDrinker;
   }

   @Override
   public Integer drink() {
      return ((this.professionalDrinker*(drink.drink()))/100);
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
              '}';
   }


   /*@Override
   public Integer getRandom(int min, int max) {
      int i = ThreadLocalRandom.current().nextInt(min, max)+1;
      return i;
   }*/


   /*@Override
   public ArrayList generateTeam() {
      List<Viking> vikingList = new ArrayList<Viking>();
      Random ran = new Random();
      for (int i=0; i<11; i++){
         vikingList.add(
                 new Viking(
                         "Viking N° " + i + 1,
                         getRandom(18,90), // Allowed age
                         getRandom(50,160), // Allowed weight
                         new vikingDrinkImpl(),
                         new vikingPeeImpl()
                 )
         );
      }
      return (ArrayList) vikingList;
   }*/
}

