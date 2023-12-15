package tp2;

//Point.java

public class Point {

	private int x;
    private int y;

    /*public Point() {
        this.x = 0;
        this.y = 0;
    }*/

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    //Déplacer un point d'une longueur sur l'axe des x et des y
    public void deplacer(int dX, int dY) {
        this.x += dX;
        this.y += dY;
    }
    //Ramener un point à l'origine par une méthode reset()
    public void reset() {
    	this.x=0;
    	this.y=0;
    }
    //calcule la distance entre le point this et le point b en paramètre.
    public double distance (Point b) {
    	return Math.hypot(b.getX() - this.x, b.getY() - this.y);    	
    }
    public static double distance(Point a, Point b) {
        return Math.hypot(b.getX() - a.getX(), b.getY() - a.getY());
    }
    
    // Méthode equals pour comparer deux points
    public boolean equals(Object o) {
        // Vérifier si l'objet est une instance de la classe Point
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        // Convertir l'objet en Point
        Point AutrePoint = (Point) o;
        // Comparer les coordonnées
        return this.x == AutrePoint.x && this.y == AutrePoint.y;
    }
    public boolean equals(Point a) {
    	return (this.x==a.x && this.y==a.y);
    }
    public Point() {
    	//x=0;
    	//y=0;
    	this(0,0);
    }
    public Point(int a, int b) {
    	x=a;
    	y=b;
    }
    //constructeur avec un seul paramètre (initialisation de l’abscisse)
    public Point(int x) {
        this.x = x;
        this.y = 0;
    }
    /*2éme méthode
    public Point(int x) {
        this(x, 0); // Appelle le constructeur avec deux paramètres
    }*/
    //le constructeur (par défaut) par this (0);
    /*public Point(int a) {
        this(0); 
        }*/
    //To String
    public String toString() {
    	return "(" + x + "," + y + ")";
    }
 // Constructeur de copie
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    


}