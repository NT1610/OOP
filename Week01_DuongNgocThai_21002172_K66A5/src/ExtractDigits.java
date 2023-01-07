public class ExtractDigits {
    public static void main(String[] args) {
        int n = 15423;
        int resurt = 0;

        while (n > 0){
            resurt = resurt*10 + n%10;
            n = n/10;
        }
        System.out.println(resurt);
    }
}
