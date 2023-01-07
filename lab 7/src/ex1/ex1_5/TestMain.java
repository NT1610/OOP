package ex1.ex1_5;

public class TestMain {
    public static void main(String[] args) {
        //circle
        GeometricObject geometricObject = new Circle(3);
        System.out.println(geometricObject);
        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject.getPerimeter());

        GeometricObject geometricObject1 = new ResizableCircle(3);
        System.out.println(geometricObject1);

        Resizable resizable = new ResizableCircle(3);
        resizable.resize(50);
        System.out.println(resizable);
    }
}
