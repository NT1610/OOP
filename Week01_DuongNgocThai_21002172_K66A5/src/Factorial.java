public class Factorial {
    public static void main(String[] args){
        int n = 20;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            System.out.print(factorial + ",");
        }
        System.out.print("The Factorial of " + n +" is "+ factorial);
    }
}
