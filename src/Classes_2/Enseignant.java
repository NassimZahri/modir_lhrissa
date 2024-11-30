package Classes_2;

public class Enseignant extends Personne implements Affichage{
    private String numSomme;
    public String getNumSomme() {
        return numSomme;
    }

    public Enseignant(String nom ,String prenom ,String numSomme){
        super(nom,prenom);
        this.numSomme = numSomme;
    }

    @Override
    public void Travailler() {
        System.out.println("Je suis un enseignant.");
    }

    @Override
    public void afficher() {
        System.out.println(this.getNom() + " " + this.getPrenom() + " " + this.getNumSomme());
    }
}
