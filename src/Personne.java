public class Personne{
    private String prenom;
    private String nom;

    /// constructors

    public Personne() {
        this.prenom = "";
        this.nom = "";
    }

    public Personne(String prenom,String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    // Copy constructor
    public Personne(Personne otherPerson) {
        this.prenom = otherPerson.prenom;
        this.nom = otherPerson.nom;
    }


    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String inputPrenom){ this.prenom = inputPrenom;}
    public void setNom(String inputNom){ this.prenom = inputNom;}

    public void printNomComplet(){
        System.out.println("Nom complet: " + getPrenom() + " " + getNom());
    }

    public boolean estEgale(Personne otherPerson) {
        return this.prenom.equals(otherPerson.getPrenom()) && this.nom.equals(otherPerson.getNom());
    }
}