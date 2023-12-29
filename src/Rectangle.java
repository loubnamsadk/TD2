public class Rectangle {
    private double longueur;
    private double largeur;
    public Rectangle() {
        this.longueur = 0.0;
        this.largeur = 0.0;
    }
    public Rectangle(double longueur, double largeur) {
        setLongueur(longueur);
        setLargeur(largeur);
    }
    public Rectangle(Rectangle autreRectangle) {
        this.longueur = autreRectangle.longueur;
        this.largeur = autreRectangle.largeur;
    }
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        } else {
            System.out.println("Longueur invalide. La longueur doit être positive.");
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        } else {
            System.out.println("Largeur invalide. La largeur doit être positive.");
        }
    }
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }
    public double calculerAire() {
        return longueur * largeur;
    }
    public boolean isCarre() {
        return longueur == largeur;
    }
    @Override
    public String toString() {
        return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
    }
}