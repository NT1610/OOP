package exercises2.exercises2_10;

public class TestRectangle {
    public static void main(String[] args) {
        MyPoint bottomRight = new MyPoint(3,2);
        MyPoint topLeft = new MyPoint(2,3);

        MyRectangle rectangle1 = new MyRectangle(topLeft, bottomRight);

        System.out.println(rectangle1);
    }
}
