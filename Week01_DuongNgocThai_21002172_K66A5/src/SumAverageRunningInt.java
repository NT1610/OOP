import com.sun.source.tree.WhileLoopTree;

public class SumAverageRunningInt {
    public static void main(String[] args){
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        /*
        // "for"
        for (int number = LOWERBOUND; number <= UPPERBOUND;number++){
            sum += number;
        }
        */

        /*
        // "while-do"
        int number = LOWERBOUND;
        while (number <= UPPERBOUND){
            sum += number;
            number++;
        }

        */

        /*
        // "do-while"
        int number = LOWERBOUND;
        do {
            sum += number;
            number++;
        }while (number <= UPPERBOUND);
        */


        //Modify the program to find the ”sum of the squares”
        // of all the numbers from 1 to 100,
        //i.e. 1 ∗ 1 + 2 ∗ 2 + 3 ∗ 3 + ... + 100 ∗ 100.

        for (int i = LOWERBOUND; i <= UPPERBOUND ; i++) {
            sum += i*i;
        }




        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + sum*1.0/100);

        //Modify the program to produce two sums: sum of odd numbers and sum of even
        //numbers from 1 to 100. Also compute their absolute difference.

        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;

        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            if(number%2 != 0){
                sumOdd += number;
            }else {
                sumEven += number;
            }
        }
        if (sumOdd > sumEven){
            absDiff = sumOdd - sumEven;
        }else{
            absDiff = sumEven - sumOdd;
        }
    }
}
