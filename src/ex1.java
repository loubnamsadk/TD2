public class ex1{
    private char nom;
    private double abscisse;

    // Constructeur
    public ex1 (char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    // Méthode pour afficher le nom du point et son abscisse
    public void affiche() {
        System.out.println("Point " + nom + " : abscisse = " + abscisse);
    }

    // Méthode pour effectuer une translation
    public void translate(double translation) {
        abscisse += translation;
    }
    public static void main(String[] args) {
        ex1 pointP = new ex1('A', 5.0);
        System.out.println("Avant la translation :");
        pointP.affiche();

        // Translation du point P de 3.0 unités
        pointP.translate(3.0);

        // Affichage des informations du point P après la translation
        System.out.println("Après la translation :");
        pointP.affiche();
    }
}
