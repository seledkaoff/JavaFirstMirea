package ru.mirea.task1.opt3;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        int len = scan.nextInt();
        int[] digits = new int[len];
        System.out.printf("\nВведите %d целых чисел: ", len);

        for (int i = 0; i < len; i++){
            digits[i] = scan.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        float average = (float)sum / digits.length;
        System.out.printf("sum: %d\n", sum);
        System.out.printf("average: %.2f", average);
    }
}
