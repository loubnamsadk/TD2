public class Main{
    public static void main(String[] args) {
        Livre livre1 = new Livre();
        Livre livre2 = new Livre("Titre1");
        Livre livre3 = new Livre("Titre2", "Auteur1");
        Livre livre4 = new Livre("Titre3", "Auteur2", 19.99);
        Livre livre5 = new Livre("Titre4", "Auteur3", 29.99, 2022);
        Livre livreCopie = new Livre(livre5);
        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(livre3);
        System.out.println(livre4);
        System.out.println(livre5);
        System.out.println(livreCopie);
        livre2.setAnnee(2021);
        livre3.setPrix(9.99);
        System.out.println("Après modification :");
        System.out.println(livre2);
        System.out.println(livre3);
    }
}
