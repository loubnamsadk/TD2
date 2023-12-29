  public class Livre {
    private String titre;
    private String auteur;
    private double prix;
    private int annee;
    public Livre() {
        this.titre = "Titre inconnu";
        this.auteur = "Auteur inconnu";
        this.prix = 0.0;
        this.annee = 0;
    }

    public Livre(String titre) {
        this.titre = titre;
        this.auteur = "Auteur inconnu";
        this.prix = 0.0;
        this.annee = 0;
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = 0.0;
        this.annee = 0;
    }

    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = 0;
    }

    public Livre(String titre, String auteur, double prix, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
    }
    public Livre(Livre autreLivre) {
        this.titre = autreLivre.titre;
        this.auteur = autreLivre.auteur;
        this.prix = autreLivre.prix;
        this.annee = autreLivre.annee;
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", annee=" + annee +
                '}';
    }
}
