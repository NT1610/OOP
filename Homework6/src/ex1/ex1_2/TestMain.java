package ex1.ex1_2;

public class TestMain {
    public static void main(String[] args) {
        MyTime i1 = new MyTime(23, 59, 59);
        System.out.println(i1.toString());
        System.out.println(i1.nextSecond().toString());
        System.out.println(i1.nextMinute().toString());
        System.out.println(i1.nextHour().toString());

        MyTime i2 = new MyTime(0, 0, 0);
        System.out.println(i2.toString());
        System.out.println(i2.previousSecond().toString());
        System.out.println(i2.previousMinute().toString());
        System.out.println(i2.previousHour().toString());
    }
}
