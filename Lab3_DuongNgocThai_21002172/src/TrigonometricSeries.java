public class TrigonometricSeries {
    public static double sin(double x, int numTerms) {
        double sinValue = 0.0;
        for (int i = 1; i < numTerms; i += 2) {
            double product = 1;
            for (int j = 1; j <= i; j++) {
                product *= x / j;
            }
            if (i % 4 == 1) {
                sinValue += product;
            } else {
                sinValue -= product;
            }
        }
        return sinValue;
    }

    public static double cos(double x, double numTerms) {
        double cosValue = 0.0;
        for (int i = 0; i < numTerms; i += 2) {
            double product = 1;
            for (int j = 1; j <= i; j++) {
                product *= product / j;
            }
            if (i % 4 == 2) {
                cosValue -= product;
            } else {
                cosValue += product;
            }
        }
        return cosValue;
    }

    public static void main(String[] args) {
        double x = (Math.PI) / 2;
        int n = 10;
        System.out.println(sin(x, n));
        double k = Math.sin(x);
        System.out.println(k);
    }
}
