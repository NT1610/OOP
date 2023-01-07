import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        final char[] hex = {'0', '1', '2', '3'
                , '4', '5', '6', '7'
                , '8', '9', 'A', 'B'
                , 'C', 'D', 'E', 'F'};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Decimal string: ");
        int numDec = in.nextInt();
        int surplus;
        String strHex = "";
        while (numDec > 0) {
            surplus = numDec % 16;
            strHex = hex[surplus] + strHex;
            numDec = numDec / 16;
        }
        System.out.println("The equivalent hex adecim al number is " + strHex);
    }
}
