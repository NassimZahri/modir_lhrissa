package Classes_2_2;

public abstract class Humain {
    private String nom;
    private String prenom;

    public Humain(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract void parler();
}
