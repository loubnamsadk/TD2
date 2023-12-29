public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4.0, 5.0);
        Rectangle rectangle3 = new Rectangle(rectangle2);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        rectangle1.setLongueur(3.0);
        rectangle1.setLargeur(3.0);
        System.out.println("Rectangle1 après modification : " + rectangle1);
        System.out.println("Périmètre de rectangle2 : " + rectangle2.calculerPerimetre());
        System.out.println("Aire de rectangle2 : " + rectangle2.calculerAire());
        System.out.println("Est-ce que rectangle2 est un carré ? " + rectangle2.isCarre());
        System.out.println("Est-ce que rectangle1 est un carré ? " + rectangle1.isCarre());
    }
}