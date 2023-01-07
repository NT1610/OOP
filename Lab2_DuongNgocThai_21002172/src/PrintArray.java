import java.util.Scanner;

public class PrintArray {
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
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1)) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
