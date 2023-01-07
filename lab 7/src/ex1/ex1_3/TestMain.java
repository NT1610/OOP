package ex1.ex1_3;

public class TestMain {
    public static void main(String[] args) {
        Movable movablePoint1 = new MovablePoint(3,4,5,6);
        System.out.println(movablePoint1.toString());
        movablePoint1.moveUp();
        System.out.println(movablePoint1.toString());
        movablePoint1.moveDown();
        System.out.println(movablePoint1.toString());
        movablePoint1.moveLeft();
        System.out.println(movablePoint1.toString());
        movablePoint1.moveRight();
        System.out.println(movablePoint1.toString());
    }
}
