package ru.mirea.task1;

public class opt6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 гармонических чисел:");
        for (int i = 1; i < 11; i++){
            double harmNum = 1.0/ i;
            System.out.printf("H(%d) = %.4f\n", i, harmNum);
        }
    }
}
