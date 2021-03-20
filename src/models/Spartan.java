package models;

public class Spartan extends Human{

    private int toleranciaExtra;

    public Spartan(int toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    public int getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(int toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }
}
