package exercises1.exercises1_4;

public class TestMain {
    public static void main(String[] args) {
        Shape newShape = new Shape();
        System.out.println("Shape[: " + newShape.toString() + "]");

        Circle newcircle = new Circle();
        newcircle.setRadius(4.0);
        newcircle.setColor("blue");
        newcircle.setFilled(false);
        System.out.println("Circle[: " + newcircle.toString() + ", Circle Area= " + newcircle.getArea()
                + ", Circle Perimeter= " + newcircle.getPerimeter() + "]");

        Rectangle newRec = new Rectangle();
        newRec.setColor("black");
        newRec.setLength(5);
        newRec.setWidth(8);
        System.out.println("Rectangle[: " + newRec.toString() + ", Rectangle Area= " + newRec.getArea()
                + ", Rectangle Perimeter= " + newRec.getPerimeter() + "]");

        Square newSquare = new Square();
        newSquare.setSide(10);
        newSquare.setColor("white");
        System.out.println("Square[: " + newSquare.toString() + ", Square Area= " + newSquare.getArea()
                + ", Square Perimeter= " + newSquare.getPerimeter() + "]");
    }
}
