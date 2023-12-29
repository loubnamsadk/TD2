 public class Main1 {
    public static void main(String[] args) {
        // Test de la classe Temps
        Temps temps1 = new Temps(); // Temps par défaut
        temps1.afficherTemps();

        Temps temps2 = new Temps(8); // 8 heures
        temps2.afficherTemps();

        Temps temps3 = new Temps(12, 30); // 12 heures, 30 minutes
        temps3.afficherTemps();

        Temps temps4 = new Temps(18, 45, 30); // 18 heures, 45 minutes, 30 secondes
        temps4.afficherTemps();

        Temps temps5 = new Temps(25, 70, 80); // Valeurs invalides, sera réinitialisé à 00:00:00
        temps5.afficherTemps();
        }
        }
