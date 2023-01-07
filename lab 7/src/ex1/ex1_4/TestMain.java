package ex1.ex1_4;

public class TestMain {
    public static void main(String[] args) {
        Movable movablePoint1 = new MovablePoint(3, 4, 5, 6);
        System.out.println(movablePoint1);
        movablePoint1.moveUp();
        System.out.println(movablePoint1);
        movablePoint1.moveDown();
        System.out.println(movablePoint1);
        movablePoint1.moveLeft();
        System.out.println(movablePoint1);
        movablePoint1.moveRight();
        System.out.println(movablePoint1);
        System.out.println("-------------");
        Movable movablePoint2 = new MovableCircle(3, 4, 5, 6, 4);
        System.out.println(movablePoint2);
        movablePoint1.moveUp();
        System.out.println(movablePoint2);
        movablePoint1.moveDown();
        System.out.println(movablePoint2);
        movablePoint1.moveLeft();
        System.out.println(movablePoint2);
        movablePoint1.moveRight();
        System.out.println(movablePoint2);
    }
}
