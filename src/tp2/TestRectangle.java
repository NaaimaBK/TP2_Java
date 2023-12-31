package tp2;

public class TestRectangle {
	public static void main(String[] args) {
        // Cr�ation d'objets Point pour les coins du rectangle
        Point hg = new Point(2, 5);
        Point bd = new Point(8, 3);

        // Cr�ation d'un rectangle avec les points sp�cifi�s
        Rectangle rectangle = new Rectangle(hg, bd);

        // Affichage des coordonn�es
        System.out.println("Avant zoom :");
        rectangle.afficher();

        // Calcul et affichage de la surface
        int surface = rectangle.surface();
        System.out.println("Surface : " + surface);

        // Zoom du rectangle
        rectangle.zoom(2, 2);

        // Affichage des coordonn�es apr�s zoom
        System.out.println("\nApr�s zoom :");
        rectangle.afficher();

        // Calcul et affichage de la nouvelle surface
        surface = rectangle.surface();
        System.out.println("Nouvelle surface : " + surface);
    }
}
