package TP2;

public class Cercle extends Forme {
    private double rayon;

    public double getRayon(){
        return this.rayon;
    }

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * (Math.pow(rayon,2));
    }

    @Override
    public double calculerPerimetre() {
        return Math.PI * 2 * rayon;
    }
}
