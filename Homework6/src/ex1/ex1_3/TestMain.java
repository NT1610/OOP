package ex1.ex1_3;

public class TestMain {
    public static void main(String[] args) {

        MyDate myDate1 = new MyDate(2020,4,24);
        System.out.println(myDate1.nextDay());
        System.out.println(myDate1.nextMonth());
        System.out.println(myDate1.nextYear());

        MyDate myDate2 = new MyDate(2021,3,31);
        System.out.println(myDate2.previousDay());
        System.out.println(myDate2.previousMonth());
        System.out.println(myDate2.previousYear());

    }
}
