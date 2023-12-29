public class ex2 {
    private double abscisse;
    private double ordonnee;
    public ex2() {
        this.abscisse = 0.0;
        this.ordonnee = 0.0;
    }
    public ex2(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }
    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }
    public double calculerNorme() {
        return Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
    }

    public static void main(String[] args) {
        ex2 pointP = new ex2(3.0, 4.0);
        System.out.println("Coordonnées de P : (" + pointP.getAbscisse() + ", " + pointP.getOrdonnee() + ")");
        System.out.println("Norme de P : " + pointP.calculerNorme());
        pointP.setAbscisse(1.0);
        pointP.setOrdonnee(2.0);
        System.out.println("Nouvelles coordonnées de P : (" + pointP.getAbscisse() + ", " + pointP.getOrdonnee() + ")");
    }
}

