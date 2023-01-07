package exercises1.exercises1_8;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial poly2 = new MyPolynomial(3, 0, 11, 6);
        System.out.println("poly 2 degree :" + poly2.getDegree());
        System.out.println("poly2 : " + poly2);

        MyPolynomial poly1 = new MyPolynomial(1, 3, 4);
        System.out.println("poly1 degree: " + poly1.getDegree());
        System.out.println("poly1 : " + poly1);

        System.out.println("Poly1 + poly2 = " + poly1.add(poly2));

        System.out.println("poly1 * poly2 = "+poly1.multiply(poly2));

        System.out.println("Evaluate poly1 when x = 1.92: ");
        System.out.println(poly1.evaluate(1.34));

    }
}
