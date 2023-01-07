import java.util.Scanner;

public class Print {
    public static int[] inputArr(int lenArr, Scanner in) {

        int[] arr = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
    public static void print(int[] array){
        if (array.length == 0) {
            System.out.println("[]");
        }else {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if (i == (array.length - 1)) {
                    System.out.print(array[i] + "]");
                } else {
                    System.out.print(array[i] + ", ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lenArr = in.nextInt();
        int[] arr = inputArr(lenArr, in);
        in.close();
        print(arr);
    }
}
