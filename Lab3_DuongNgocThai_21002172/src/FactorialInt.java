public class FactorialInt {
    public static void factorialInt() {
        final int MAXINTEGER = Integer.MAX_VALUE;
        int count = 1;
        int factorial = 1;
        while (true) {
            if ((MAXINTEGER / factorial) > count) {
                factorial *= count;
                System.out.println("The factoral of " + count + " is " + factorial);
            } else {
                System.out.println("The factoral of " + count + " is out of range");
                break;
            }
            count++;
        }
    }

    public static void main(String[] args) {
        factorialInt();
    }
}
