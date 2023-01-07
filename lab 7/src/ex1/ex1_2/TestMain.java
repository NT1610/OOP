package ex1.ex1_2;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject geometricObject1 = new Circle(3);
        System.out.println(geometricObject1.getArea());
        System.out.println(geometricObject1.getPerimeter());
        System.out.println(geometricObject1.toString());

        GeometricObject geometricObject2 = new Rectangle(3, 4);
        System.out.println(geometricObject2.getArea());
        System.out.println(geometricObject2.getPerimeter());
        System.out.println(geometricObject2.toString());
    }
}
