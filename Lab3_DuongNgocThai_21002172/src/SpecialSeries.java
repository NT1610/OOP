public class SpecialSeries {
    public static double specialSeries(double x, int numTerms) {
        double result = 0;
        for (int i = 1; i <= 2 * numTerms - 1; i += 2) {
            double product = 1;
            for (int j = 1; j < i; j++) {
                if (j % 2 == 1) {
                    product *= j * x;
                } else {
                    product *= x / j;
                }
            }
            result += product * (x / i);
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 0.5;
        int numTerms = 5;
        System.out.println(specialSeries(x, numTerms));
    }
}
