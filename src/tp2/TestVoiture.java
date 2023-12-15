package tp2;

public class TestVoiture {
	public static void main(String[] args) {
        Moteur moteurVoiture = new Moteur("MoteurA", 200);

        Roue[] rouesVoiture = { new Roue(15, 20), new Roue(15, 20), new Roue(15, 20), new Roue(15, 20) };
        Roue roueDeSecours = new Roue(15, 20);

        Voiture maVoiture = new Voiture("Mercedes", "Wagon", moteurVoiture, rouesVoiture, roueDeSecours);

        maVoiture.demarre();
        maVoiture.accelere(50);

        System.out.println("Puissance du moteur : " + maVoiture.deQuellePuissance());
        System.out.println("Vitesse actuelle : " + maVoiture.getVitesse());

        //System.out.println("Taille des roues avant : " + maVoiture.tailleRouesAvant());
        //System.out.println("Taille de la roue de secours : " + maVoiture.tailleRoueSecours());
    }
}
