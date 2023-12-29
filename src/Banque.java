public class Banque {
    private int numeroCompte;
    private double solde;
    private String titulaire;

    public Banque(int numeroCompte, double solde, String titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Montant invalide. Veuillez déposer un montant positif.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Montant invalide. Veuillez retirer un montant positif et ne dépassant pas le solde.");
        }
    }

    public void afficherInformations() {
        System.out.println("Informations du compte:");
        System.out.println("Numéro de compte: " + numeroCompte);
        System.out.println("Titulaire: " + titulaire);
        System.out.println("Solde: " + solde);
    }
}

