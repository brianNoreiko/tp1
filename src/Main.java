import Impl.spartanDrinkImpl;
import Impl.spartanPeeImpl;
import Impl.vikingDrinkImpl;
import Impl.vikingPeeImpl;
import models.Spartan;
import models.Viking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static Integer getRandom(int min, int max) {
        int i = ThreadLocalRandom.current().nextInt(min, max)+1;
        return i;
    }
    public static void main(String[] args) {
       List<Spartan> spList = new ArrayList<Spartan>();
       List<Viking> vkList = new ArrayList<Viking>();

        for (int i=0; i<11; i++){
            vkList.add(
                    new Viking(
                            "Viking N° " + i + 1,
                            getRandom(18,90), // Allowed age
                            getRandom(50,160), // Allowed weight
                            new vikingDrinkImpl(),
                            new vikingPeeImpl()
                    )
            );
        }
        for (int i=0; i<11; i++){
            spList.add(
                    new Spartan(
                            "Spartan N° " + i + 1,
                            getRandom(18, 90), // Allowed age
                            getRandom(50, 160), // Allowed weight
                            new spartanDrinkImpl(),
                            new spartanPeeImpl()
                    )
            );
        }


       vkList.sort(Comparator.comparing(Viking::getAge));
       spList.sort(Comparator.comparing(Spartan::getAge));

       Tournament tournament = new Tournament(vkList,spList);


        vkList.forEach(System.out::println);
        System.out.println("\n");
        spList.forEach(System.out::println);

       /*vkAux = tournament.chooseOneParticipant(vkList);
       spAux = tournament.chooseOneParticipant(spList);*/


       //tournament.drinkUntilPee(vkAux, spAux);

        }




}

