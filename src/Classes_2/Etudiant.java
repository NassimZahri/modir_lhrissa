package Classes_2;

public class Etudiant extends Personne implements Affichage{
    private String CNE;

    public Etudiant(String nom, String prenom, String id){
        super(nom,prenom);
        this.CNE = id;
    }
    public void afficherEtu(){
        super.afficherNom();
        System.out.println("CNE: " + CNE);
    }

    @Override
    public void afficher() {
        this.afficherEtu();
    }
}