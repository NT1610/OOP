import java.util.Scanner;

public class ArrToString {
    public static int[] inputArr(int lenArr, Scanner in) {
        int[] arr = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static String arrayToString(int[] arr) {
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder strArr = new StringBuilder("[");
        if (arr.length == 1) {
            strArr.append(Integer.toString(arr[0]));
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length - 1) {
                    strArr.append(Integer.toString(arr[i]) + ", ");
                } else {
                    strArr.append(Integer.toString(arr[i]));
                }
            }
        }
        strArr.append("]");
        return strArr.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lenArr = in.nextInt();
        int[] arr = inputArr(lenArr, in);
        in.close();
        System.out.println(arrayToString(arr));
    }
}
