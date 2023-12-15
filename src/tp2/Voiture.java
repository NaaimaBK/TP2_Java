package tp2;

public class Voiture {
	private boolean estDemarree;
	private double vitesse;
	private String marque;
    private String modele;
    
    private Moteur moteur;
    private Roue[] roues;
    private Roue roueDeSecours;
    // Constructeur avec composition et agrégation
    public Voiture(String marque, String modele, Moteur moteur, Roue[] roues, Roue roueDeSecours) {
        this.marque = marque;
        this.modele = modele;
        this.moteur = moteur;
        this.roues = roues;
        this.roueDeSecours = roueDeSecours;
    }
    // Méthodes getter et setter pour accéder aux attributs
    public boolean isEstDemarree() {
        return estDemarree;
    }

    public double getVitesse() {
        return vitesse;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public Roue[] getRoues() {
        return roues;
    }

    public Roue getRoueDeSecours() {
        return roueDeSecours;
    }
//setters
    public void setEstDemarree(boolean estDemarree) {
        this.estDemarree = estDemarree;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public void setRoues(Roue[] roues) {
        this.roues = roues;
    }

    public void setRoueDeSecours(Roue roueDeSecours) {
        this.roueDeSecours = roueDeSecours;
    }
    
    // Autres méthodes spécifiques à la voiture
	public int deQuellePuissance() {
        return moteur.getPuissance();
	}
	
	public void accelere(double vitesse) {
	if (estDemarree) {
	this.vitesse = this.vitesse + vitesse;
	}
	}
	
	public void demarre() {
        estDemarree = true;
	}
	
	// Méthode pour changer le moteur
    public void changerLeMoteur(Moteur nouveauMoteur) {
        moteur.changerLeMoteur(nouveauMoteur);
    }
	
	
	// Méthode pour obtenir la taille des roues avant
    public int tailleRouesAvant() {
        if (roues != null && roues.length >= 2) {
            return roues[0].getDiametreJante();
        }
        return -1; // ou une valeur par défaut
    }

    // Méthode pour obtenir la taille de la roue de secours
    public int tailleRoueSecours() {
        if (roueDeSecours != null) {
            return roueDeSecours.getDiametreJante();
        }
        return -1; // ou une valeur par défaut
    }
}

