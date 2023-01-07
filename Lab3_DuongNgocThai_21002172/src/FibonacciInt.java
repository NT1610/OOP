public class FibonacciInt {
    public static void fibonacciInt() {
        int count = 0;
        int fibonaci = 0;
        int fb0 = 0;
        int fb1 = 1;
        while (true) {
            fibonaci = fb0 + fb1;
            if (Integer.MAX_VALUE - fb1 < fb0) {
                System.out.println("F(" + count + ") is out of the range of int");
                break;
            }

            System.out.println("F(" + count + ") = " + fibonaci);
            fb1 = fb0;
            fb0 = fibonaci;
            count++;
        }
    }

    public static void main(String[] args) {
        fibonacciInt();
    }
}
