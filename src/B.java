public class B{
    public static void main(String[] args) {
     Banque compte1 = new Banque(1, 5000.75, "AB 1200");
        compte1.afficherInformations();
        System.out.println("Solde actuel: " + compte1.getSolde());
        compte1.deposer(500);
        compte1.afficherInformations();
        System.out.println("Solde actuel: " + compte1.getSolde());
        compte1.retirer(200);
        compte1.afficherInformations();
        System.out.println("Solde actuel: " + compte1.getSolde());
    }
}