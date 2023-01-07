public class ComputePI {
    public static void main(String[] args){
        double sum = 0.0;
        int MAXDENOMINATOR = 10000;
        for (int denominator = 1; denominator <= MAXDENOMINATOR ; denominator+=2) {
            if (denominator % 4 == 1){
                sum += 4.0/denominator;
            } else if (denominator % 4 == 3) {
                sum -= 4.0/denominator;
            }else{
                System.out.println("Impossible!!!");
            }
        }
        System.out.println(sum);
    }
}
