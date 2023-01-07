package ex1.ex1_4;

import java.lang.Math;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 4, 20, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
            ball.move();
            System.out.println(box.collidesWith(ball));
            System.out.println(ball);
        }
    }
}
