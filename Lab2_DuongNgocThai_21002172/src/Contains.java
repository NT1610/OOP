import java.util.Scanner;

public class Contains {
    public static int[] inputArr(int lenArr, Scanner in) {

        int[] arr = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
    public static boolean contains(int[] arr, int key){
        for (int element : arr) {
            if(element == key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = in.nextInt();
        System.out.print("Enter the array length: ");
        int lenArr = in.nextInt();
        int[] arr = inputArr(lenArr, in);

        System.out.println(contains(arr,key));
    }
}
