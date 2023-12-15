package tp2;

public class Moteur {
    private String nom;
    private int puissance;
    private double kilometrage; // Ajout pour la durée de vie du moteur
//setter
    public Moteur(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
        this.kilometrage = 0;
    }
//getters
    public String getNom() {
        return nom;
    }

    public int getPuissance() {
        return puissance;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    // Méthode pour mettre à jour le kilometrage
    public void rouler(double distance) {
        this.kilometrage += distance;
    }
 // Méthode pour changer le moteur
    public void changerLeMoteur(Moteur nouveauMoteur) {
        this.nom = nouveauMoteur.nom;
        this.puissance = nouveauMoteur.puissance;
        this.kilometrage = 0;
    }
}