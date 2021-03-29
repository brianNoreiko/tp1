import models.Spartan;
import models.Viking;

import java.util.List;

public class Tournament {

    private List<Viking> Vikings;
    private List<Spartan> Spartans;
    private Object winner;


    public Tournament(List<Viking> vikings, List<Spartan> spartans) {
        this.Vikings = vikings;
        this.Spartans = spartans;
    }

    public List<Viking> getVikings() {
        return Vikings;
    }

    public void setVikings(List<Viking> vikings) {
        Vikings = vikings;
    }

    public List<Spartan> getSpartans() {
        return Spartans;
    }

    public void setSpartans(List<Spartan> spartans) {
        Spartans = spartans;
    }

    public Object getWinner() {
        return winner;
    }

    public void setWinner(Object winner) {
        this.winner = winner;
    }

    public  Object drinkUntilPee(Viking viking, Spartan spartan){
        //present them
        System.out.println("Enfrentamiento entre: "+viking.getName()+" y "+spartan.getName());
        //Let's drink!
        while ((viking.getEnduranceLeft() > 0) && (spartan.getEnduranceLeft() > 0)){
            viking.setEnduranceLeft(viking.getEnduranceLeft() - viking.drink());
            spartan.setEnduranceLeft((spartan.getEnduranceLeft() - spartan.drink()));
        }
        if (viking.getEnduranceLeft() == spartan.getEnduranceLeft()){
            this.winner = null;
        }else if(viking.getEnduranceLeft() > spartan.getEnduranceLeft()){
            this.winner = viking;
        }else{
            this.winner = spartan;
        }

        return this.winner;
    }
}
