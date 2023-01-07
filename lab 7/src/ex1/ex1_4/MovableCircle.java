package ex1.ex1_4;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return '(' + x +
                "," + y+
                "),speed=(" + xSpeed +
                ',' + ySpeed +
                "),radius=" + radius;
    }

    public void moveUp(){
        this.y -= ySpeed;
    }

    public void moveDown(){
        this.y += ySpeed;
    }

    public void moveLeft(){
        this.x -= xSpeed;
    }

    public void moveRight(){
        this.x += xSpeed;
    }
}
