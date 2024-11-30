package TP2;

public class Rectangle extends Forme{
    double longueur, largeur;

    public Rectangle(double longueur, double largeur ){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double  getLongueur(){
        return this.longueur;
    }
    public double getLargeur(){
        return this.largeur;
    }

    @Override
    public double calculerSurface() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (longueur+largeur);
    }
}
