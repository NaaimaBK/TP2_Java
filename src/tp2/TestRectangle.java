package tp2;

public class TestRectangle {
	public static void main(String[] args) {
        // Création d'objets Point pour les coins du rectangle
        Point hg = new Point(2, 5);
        Point bd = new Point(8, 3);

        // Création d'un rectangle avec les points spécifiés
        Rectangle rectangle = new Rectangle(hg, bd);

        // Affichage des coordonnées
        System.out.println("Avant zoom :");
        rectangle.afficher();

        // Calcul et affichage de la surface
        int surface = rectangle.surface();
        System.out.println("Surface : " + surface);

        // Zoom du rectangle
        rectangle.zoom(2, 2);

        // Affichage des coordonnées après zoom
        System.out.println("\nAprès zoom :");
        rectangle.afficher();

        // Calcul et affichage de la nouvelle surface
        surface = rectangle.surface();
        System.out.println("Nouvelle surface : " + surface);
    }
}
