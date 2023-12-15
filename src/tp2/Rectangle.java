package tp2;

public class Rectangle {
	private Point hg;
	private Point bd;

	public Rectangle() {
		this.hg = new Point();
        this.bd = new Point();
	}
    // Utilisation du constructeur de copie Point(Point p) pour initialiser les points hg et bd
	public Rectangle(Point hg, Point bd) {
        this.hg = new Point(hg);
        this.bd = new Point(bd);
    }
	//les getters et setters des attributs de la classe
	public Point getHg() {
        return hg;
    }

    public void setHg(Point hg) {
        this.hg = new Point(hg);
    }

    public Point getBd() {
        return bd;
    }

    public void setBd(Point bd) {
        this.bd = new Point(bd);
    }
    
	public void afficher() {
		System.out.println("Coordonnées du haut gauche : (" + hg.getX() + ", " + hg.getY() + ")");
        System.out.println("Coordonnées du bas droit : (" + bd.getX() + ", " + bd.getY() + ")");
	}

	public int surface() {
		int largeur = Math.abs(bd.getX() - hg.getX());
        int hauteur = Math.abs(bd.getY() - hg.getY());
        return largeur * hauteur;
	}

    public void zoom (int deltax, int deltay) {
    	// Dilatation des coordonnées. Delta donné.
    	hg.setX(hg.getX() - deltax);
        hg.setY(hg.getY() - deltay);
        bd.setX(bd.getX() + deltax);
        bd.setY(bd.getY() + deltay);
    }

}
