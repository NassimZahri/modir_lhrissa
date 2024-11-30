package TP2;

public abstract class Forme {
    public abstract double calculerSurface();
    public abstract double calculerPerimetre();
    public void afficher(){
        System.out.println("Je suis une forme geometric.");
    }

}