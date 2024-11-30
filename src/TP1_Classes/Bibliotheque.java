package TP1_Classes;

public class Bibliotheque {
    private Livre[] livres = new Livre[10];
    private Emprunteur[] emprunteurs = new Emprunteur[10];

    public void ajouterLivre(Livre livre) {
        for (int i = 0; i < livres.length; i++) {
            if (livres[i] == null) {
                livres[i] = livre;
                System.out.println("Livre ajouté avec succès.");
                return;
            }
        }
        System.out.println("La bibliotheque est pleine, impossible d'ajouter un nouveau livre.");
    }

    public void ajouterEmprunteur(Emprunteur emprunteur) {
        for (int i = 0; i < emprunteurs.length; i++) {
            if (emprunteurs[i] == null) {
                emprunteurs[i] = emprunteur;
                System.out.println("Emprunteur ajouté avec succès.");
                return;
            }
        }
        System.out.println("La liste des emprunteurs est pleine, impossible d'ajouter un nouvel emprunteur.");
    }

    public void afficherLivres() {
        for (int i = 0; i < livres.length; i++) {
            if (livres[i] != null) {
                System.out.println("Livre " + (i + 1) + ": " + livres[i].getTitre());
            }
        }
    }

    public void afficherEmprunteurs() {
        for (int i = 0; i < emprunteurs.length; i++) {
            if (emprunteurs[i] != null) {
                System.out.println("Emprunteur " + (i + 1) + ": " + emprunteurs[i].getNom());
            }
        }
    }

    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();
        Livre nouveauLivre = new Livre("Titre", "Auteur", 2023, true);
        Livre nouveauLivre2 = new Livre("Titre2", "Auteur2", 2023, true);
        Livre nouveauLivre3 = new Livre("Titre3", "Auteur3", 2023, true);

        bibliotheque.ajouterLivre(nouveauLivre);
        bibliotheque.ajouterLivre(nouveauLivre2);
        bibliotheque.ajouterLivre(nouveauLivre3);

        bibliotheque.afficherLivres();

        Emprunteur nouvelEmprunteur = new Emprunteur("Nom", "Prenom", 1);
        Emprunteur nouvelEmprunteur2 = new Emprunteur("Nom2", "Prenom2", 2);
        Emprunteur nouvelEmprunteur3 = new Emprunteur("Nom3", "Prenom3", 3);

        nouveauLivre.emprunterLivre(nouvelEmprunteur);
        nouveauLivre2.emprunterLivre(nouvelEmprunteur2);
        nouveauLivre3.emprunterLivre(nouvelEmprunteur3);

        bibliotheque.ajouterEmprunteur(nouvelEmprunteur);
        bibliotheque.ajouterEmprunteur(nouvelEmprunteur2);
        bibliotheque.ajouterEmprunteur(nouvelEmprunteur3);

        bibliotheque.afficherEmprunteurs();


    }
}