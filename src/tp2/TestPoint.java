package tp2;

public class TestPoint {
	static public void main(String args[]) {
		Point p= new Point();
		Point a= new Point();
		Point b= new Point();
		p.setX(2);
		p.setY(5);
		a.setX(7);
		a.setY(7);
		b.setX(2);
		b.setY(3);
		//p.deplacer(3, 10);
		//p.reset();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		double distance1 = p.distance(b);
        System.out.println("Distance entre les points this et b: " + distance1);
        
        double distanceAB = Point.distance(a, b);
        System.out.println("Distance entre les points A et B (version-2) : " + distanceAB);
        //a=b;
        boolean areEqual = a.equals(b);
        System.out.println("Les points A et B sont-ils égaux ? " + areEqual);
        //
        Object e = new Point (2,5);
        Object f = new Point (2,5);
        boolean objectEquals = e.equals(f);
        System.out.println("Object Equals: " + objectEquals);
        
        //Notion de constructeur
        Object c = new Point(); 
        Object d = new Point(5,2);
        boolean objectEquals2 = ((Point) c).equals(d);
        System.out.println("Object Equals2: " + objectEquals2);
        
        //tester l'égalité de 2 strings
        String s1="hello";
        String s2="hello";
        boolean stringEqual = s1.equals(s2);
        System.out.println("Les 2 strings sont-ils égaux ? " + stringEqual);
        
        //toString
        Point pt= new Point(2,5);
        System.out.println(pt.toString());
        
        //Codage d’une association simple
        //Utilisation du constructeur de copie
        Point pointcopie = new Point(p);
        System.out.println("Coordonnées du point copie de p): (" + pointcopie.getX() + ", " + pointcopie.getY() + ")");
        
        //Codage d’une composition/agrégation
        
	}

}
