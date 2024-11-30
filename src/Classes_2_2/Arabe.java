package Classes_2_2;

public class Arabe extends Humain {
    private String pays;

    public Arabe(String nom,String prenom, String pays){
        super(nom, prenom);
        this.pays = pays;
    }

    @Override
    public void parler() {
        System.out.println("Salam!");
    }
}
