import java.util.Scanner;
import java.lang.Math;

public class CircleComputation {
    public static void main(String[] args) {
        System.out.println("Enter the radius: ");

        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        double diameter = 2.0 * r;
        double area = Math.PI * r * r;
        double circum = 2.0 * Math.PI * r;
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circum);
    }
}
