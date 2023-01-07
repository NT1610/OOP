import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = in.nextInt();
        int[] arrGrade = new int[numStudents];

        for (int i = 1; i <= numStudents; i++) {
            System.out.println("Enter the grade for student " + i + ": ");
            arrGrade[i - 1] = in.nextInt();
            while (0 >= arrGrade[i - 1] || arrGrade[i - 1] >= 100) {
                System.out.println("You entered it wrong");
                System.out.println("Enter the grade for student " + i + ": ");
                arrGrade[i - 1] = in.nextInt();
            }
        }
        in.close();

        int sum = 0;
        for (int i = 0; i < arrGrade.length; i++) {
            sum += arrGrade[i];
        }
        double average = sum * 1.0 / arrGrade.length;
        System.out.printf("The average is: %.2f%n", average);

        int min = arrGrade[0];
        int max = arrGrade[0];
        for (int i = 1; i < arrGrade.length; i++) {
            if (min > arrGrade[i]) {
                min = arrGrade[i];
            }
            if (max < arrGrade[i]) {
                max = arrGrade[i];
            }
        }
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}
