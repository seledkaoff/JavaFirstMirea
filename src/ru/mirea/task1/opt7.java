package ru.mirea.task1;
import java.util.Scanner;
public class opt7 {
    public static long factorial(int n){
        long res = 1;
        for (int i = 1; i <= n; i++){
            res *= i;

        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число для вычисления его факториала: ");
        int num = scan.nextInt();
        if (num < 0){
            System.out.printf("Факториал для отрицательного числа неопределён");

        }
        else {
            long res = factorial(num);
            System.out.printf("Факториал %d равен: %d", num, res);
        }
    }
}
