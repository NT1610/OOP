import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Key in your guess:");
        int luckyNum = (int) (Math.random() * 100);
        System.out.println(luckyNum);
        int count = 1;
        while (true) {
            int key = in.nextInt();
            if (key == luckyNum) {
                System.out.println("You got it in " + count + "trials!");
                break;
            } else if (key > luckyNum) {
                System.out.println("Try lower");
            } else if (key < luckyNum) {
                System.out.println("Try higher");
            }
            count++;
        }
        in.close();
    }
}
