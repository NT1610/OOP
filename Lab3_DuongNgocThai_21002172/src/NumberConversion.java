public class NumberConversion {
    public static int radixToDec(String str) {
        String[] str1 = str.split("");
        return 1;
    }

    public static String convertNumber(int n, int b, String str) {
        if (n < 0 || b < 2 || b > 16) {
            return "";
        }
        int m;
        int remainder = n;

        while (remainder > 0) {
            if (b > 10) {
                m = remainder % b;
                if (m >= 10) {
                    str = (char) (55 + m) + str;
                } else {
                    str = m + str;
                }
            } else {
                str = remainder % b + str;
            }
            remainder = remainder / b;
        }
        return str.toString();
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        return "";
    }

    public static void main(String[] args) {
        char ch = 'A';
        int asciiCode = ch;
        int asciiValue = (int) ch;
        System.out.println("ASCII value of " + ch + " is: " + asciiCode);
        System.out.println("ASCII value of " + ch + " is: " + asciiValue);
    }
}
