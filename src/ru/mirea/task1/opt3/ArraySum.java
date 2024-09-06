package ru.mirea.task1.opt3;

public class ArraySum {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        float average = (float)sum / digits.length;
        System.out.printf("sum: %d\n", sum);
        System.out.printf("average: %.2f", average);
    }
}
