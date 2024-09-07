package ru.mirea.task2;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ball ball = new Ball();
        ball.move(10,10);
        System.out.printf("X = %.2f, Y = %.2f\n", ball.getX(), ball.getY());

        System.out.printf("Введите два числа, для X и Y: ");
        Ball ball1 = new Ball(scan.nextDouble(), scan.nextDouble());
        System.out.println(ball1.toString());

        System.out.printf("Введите X: ");
        ball1.setX(scan.nextDouble());

        System.out.printf("\nВведите Y: ");
        ball1.setY(scan.nextDouble());

        System.out.println(ball1.toString());




    }
}
