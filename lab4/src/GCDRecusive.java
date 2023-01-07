public class GCDRecusive {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int temp = a % b;
        a = b;
        b = temp;
        return gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        System.out.println(gcd(a, b));
    }
}
