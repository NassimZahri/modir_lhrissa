public class Voiture {
    private String marque;
    private static int nbr = 0;

    public Voiture(String marque) {
        this.marque = marque;
        this.nbr++;
    }

    public void afficher() {
        System.out.println("Marque: " + this.marque);
        System.out.println("Nombre de voitures: " + this.nbr);
    }

}
