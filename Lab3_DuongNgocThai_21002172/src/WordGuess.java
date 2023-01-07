import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String keyWord = "testing";
        String[] arrKeyWord = keyWord.split("");
        String[] arrTrial = new String[keyWord.length()];
        int count = 1;
        for (int i = 0; i < keyWord.length(); i++) {
            arrTrial[i] = "_";
        }
        while (true) {
            String check = "";
            System.out.print("Key in one character or your guess word:");
            String key = in.nextLine();
            System.out.print("Trial " + count + " : ");
            for (int i = 0; i < arrKeyWord.length; i++) {
                if (key.equals(arrKeyWord[i])) {
                    arrTrial[i] = arrKeyWord[i];
                }

                check += arrTrial[i];
            }
            if (check.equals(keyWord)) {
                System.out.println(check);
                System.out.println("Congratulation!");
                System.out.print("You got in " + count + " trials");
                break;
            }
            System.out.println(check);
            count++;
        }
    }
}
