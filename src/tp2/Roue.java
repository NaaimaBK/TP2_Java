package tp2;

public class Roue {
	private int largeur;
	private int diametreJante;

	public Roue(int largeur, int diametreJante) {
        this.largeur = largeur;
        this.diametreJante = diametreJante;
    }
    // M�thodes getters pour acc�der aux attributs
	public int getLargeur() {
        return largeur;
    }

    public int getDiametreJante() {
        return diametreJante;
    }
}
