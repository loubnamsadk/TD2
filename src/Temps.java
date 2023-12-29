
public class Temps {
    private int heures;
    private int minutes;
    private int secondes;
    public Temps() {
        this.heures = 0;
        this.minutes = 0;
        this.secondes = 0;
    }

    // Constructeur avec heures
    public Temps(int heures) {
        this.heures = heures;
        this.minutes = 0;
        this.secondes = 0;
        validerTemps();
    }
    public Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = 0;
        validerTemps();
    }
    public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
        validerTemps();
    }
    public Temps(Temps autreTemps) {
        this.heures = autreTemps.heures;
        this.minutes = autreTemps.minutes;
        this.secondes = autreTemps.secondes;
    }
    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
        validerTemps();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        validerTemps();
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
        validerTemps();
    }
    private void validerTemps() {
        if (heures < 0 || heures > 23 || minutes < 0 || minutes > 59 || secondes < 0 || secondes > 59) {
            System.out.println("Temps invalide. Réinitialisation à 00:00:00.");
            this.heures = 0;
            this.minutes = 0;
            this.secondes = 0;
        }
    }
    public void afficherTemps() {
        System.out.printf("%02d:%02d:%02d\n", heures, minutes, secondes);
    }}

