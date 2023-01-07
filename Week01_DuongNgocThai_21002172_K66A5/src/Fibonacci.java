public class Fibonacci {
    public static void main(String[] args) {
         int number1 = 1;
         int number2 = 1;
         int fn,sum = number1 + number2;
         int nMax = 20;

        for (int i = 1; i <= nMax; i++) {
            if(i == 1 || i == 2){
                System.out.print(" 1 ");
            }else{
                fn = number1 + number2;
                number1 = number2;
                number2 = fn;
                sum+=fn;
                System.out.print(" " + fn + " " );

            }

        }
        System.out.println("\n" + sum*1.0/nMax);
    }
}
