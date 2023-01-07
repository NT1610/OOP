import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1011", "1011",
                "1100", "1101", "1110", "1111"};

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Hexadecimal string: ");
        String strHexa = in.next();
        in.close();
        System.out.print("The equivalent binary for hexadecimal \""+ strHexa +"\" is : ");
        String[] arrHexa = strHexa.toLowerCase().split("");
        for (int i = 0; i < arrHexa.length; i++) {
            if (arrHexa[i] == "0") {
                System.out.print(HEX_BITS[0] + " ");
            } else if (arrHexa[i].equals("1")) {
                System.out.print(HEX_BITS[1] + " ");
            } else if (arrHexa[i].equals("2")) {
                System.out.print(HEX_BITS[2] + " ");
            } else if (arrHexa[i].equals("3")) {
                System.out.print(HEX_BITS[3] + " ");
            } else if (arrHexa[i].equals("4")) {
                System.out.print(HEX_BITS[4] + " ");
            } else if (arrHexa[i].equals("5")) {
                System.out.print(HEX_BITS[5] + " ");
            } else if (arrHexa[i].equals("6")) {
                System.out.print(HEX_BITS[6] + " ");
            } else if (arrHexa[i].equals("7")) {
                System.out.print(HEX_BITS[7] + " ");
            } else if (arrHexa[i].equals("8")) {
                System.out.print(HEX_BITS[8] + " ");
            } else if (arrHexa[i].equals("9")) {
                System.out.print(HEX_BITS[9] + " ");
            } else if (arrHexa[i].equals("a")) {
                System.out.print(HEX_BITS[10] + " ");
            } else if (arrHexa[i].equals("b")) {
                System.out.print(HEX_BITS[11] + " ");
            } else if (arrHexa[i].equals("c")) {
                System.out.print(HEX_BITS[12] + " ");
            } else if (arrHexa[i].equals("d")) {
                System.out.print(HEX_BITS[13] + " ");
            } else if (arrHexa[i].equals("e")) {
                System.out.print(HEX_BITS[14] + " ");
            } else if (arrHexa[i].equals("f")) {
                System.out.print(HEX_BITS[15] + " ");
            }

        }
    }
}
