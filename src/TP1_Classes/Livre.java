package TP1_Classes;

public class Livre {
    private String titre;
    private String auteur;
    private int annePublication;
    private boolean disponible;

    // GETTERS
    public String getTitre() {
        return this.titre;
    }
    public String getAuteur() {
        return this.auteur;
    }
    public int getAnnePublication() {
        return this.annePublication;
    }
    public boolean getDisponible() {
        return this.disponible;
    }
    // SETTERS
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setAnnePublication(int annePublication) {
        this.annePublication = annePublication;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // CONSTRUCTORS
    public Livre(String titre, String auteur, int annePublication, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.annePublication = annePublication;
        this.disponible = disponible;
    }

    public Livre() {
        this.titre = "";
        this.auteur = "";
        this.annePublication = 0;
        this.disponible = false;
    }

    // METHODS

    public void afficherInfoLivre() {
        System.out.println("Titre: " + this.titre + " Auteur: " + this.auteur + " Annee de publication: " + this.annePublication + " Disponible: " + this.disponible);
    }
    //method emprunterLivre
    public void emprunterLivre(Emprunteur emprunteur) {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("Le livre a été emprunté avec succès");
        } else {
            System.out.println("Le livre n'est pas disponible");
        }
    }

    //method rendreLivre
    public void rendreLivre() {
        if (!this.disponible) {
            this.disponible = true;
            System.out.println("Le livre a été rendu avec succès");
        } else {
            System.out.println("Le livre est déjà disponible");
        }
    }

}
