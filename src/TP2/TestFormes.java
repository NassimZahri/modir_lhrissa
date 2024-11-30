package TP2;

public class TestFormes {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(5.0);
        System.out.println("Rayon: " + c1.getRayon());
        System.out.println("Surface: " + c1.calculerSurface());
        System.out.println("Perimetre: " + c1.calculerPerimetre());

        Rectangle r1 = new Rectangle(4,3);
        System.out.println("Longeur: " + r1.longueur + " Largeur: " + r1.largeur);
        System.out.println("Surface: " + r1.calculerSurface());
        System.out.println("Perimetre: " + r1.calculerPerimetre());
    }
}
