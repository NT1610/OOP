import java.util.Scanner;

public class PrintArrayInStars {
    public static int[] inputArr(int lenArr, Scanner in) {

        int[] arr = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lenArr = in.nextInt();
        int[] arr = inputArr(lenArr, in);
        in.close();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println("(" + arr[i] + ")");
        }
    }
}
