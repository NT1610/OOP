import java.util.Scanner;

public class Search {
    public static int[] inputArr(int lenArr, Scanner in) {

        int[] arr = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static int search(int[] array, int key) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = in.nextInt();
        System.out.print("Enter the array length: ");
        int lenArr = in.nextInt();
        int[] arr = inputArr(lenArr, in);
        System.out.println(search(arr, key));
    }
}
