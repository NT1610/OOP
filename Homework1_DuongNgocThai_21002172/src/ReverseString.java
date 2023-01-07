import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.nextLine();
        inStrLen = inStr.length();
        String text = "";
        char[] reverse = inStr.toCharArray();

        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            text = text + reverse[charIdx];
        }
        System.out.println("The reverse of the String '" + inStr + "' is " + "'" + text + "'.");
    }
}
