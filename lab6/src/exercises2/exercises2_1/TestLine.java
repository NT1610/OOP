package exercises2.exercises2_1;

public class TestLine {
    public static void main(String[] args) {
        Point a = new Point(2, 3);
        Point b = new Point(4, 5);
        Line ab = new Line(a, b);
        System.out.println(ab);
        System.out.println(ab.getLength());
        System.out.println(ab.getGradient());
        System.out.println(ab.getEnd());
        ab.setEndXY(3, 3);
        System.out.println(ab);
    }
}
