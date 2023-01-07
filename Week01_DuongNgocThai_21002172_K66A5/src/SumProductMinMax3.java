import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();


        int sum, product, min, max;

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        min = number1;
        if (min > number2) {
            min = number2;
        }
        if (min > number3) {
            min = number3;
        }

        max = number1;
        if (max > number2) {
            max = number2;
        }
        if (max < number3) {
            max = number3;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
