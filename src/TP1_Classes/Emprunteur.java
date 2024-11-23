package TP1_Classes;

public class Emprunteur {
    private String nom;
    private String prenom;
    private int idEmprunteur;

    public Emprunteur(String nom, String prenom, int idEmprunteur) {
        this.nom = nom;
        this.prenom = prenom;
        this.idEmprunteur = idEmprunteur;
    }

    public Emprunteur() {
        this.nom = "";
        this.prenom = "";
        this.idEmprunteur = 0;
    }

    public void afficherInfoEmprunteur() {
        System.out.println("Nom: " + this.nom + " Prenom: " + this.prenom + " ID: " + this.idEmprunteur);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setIdEmprunteur(int idEmprunteur) {
        this.idEmprunteur = idEmprunteur;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getIdEmprunteur() {
        return this.idEmprunteur;
    }

    public void emprunterLivre(Livre livre) {
        if (livre.getDisponible()) {
            livre.setDisponible(false);
            System.out.println("Le livre a été emprunté avec succès");
        } else {
            System.out.println("Le livre n'est pas disponible");
        }
    }

    public void rendreLivre(Livre livre) {
        if (!livre.getDisponible()) {
            livre.setDisponible(true);
            System.out.println("Le livre a été rendu avec succès");
        } else {
            System.out.println("Le livre est déjà disponible");
        }
    }

}
