package ru.mirea.task1.opt4;
import java.util.Scanner;
public class ShowArgs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        int len = scan.nextInt();
        int[] digits = new int[len];
        System.out.printf("\nВведите %d целых чисел: ", len);

        for (int i = 0; i < len; i++){
            digits[i] = scan.nextInt();
        }

        int sumFirst = 0;
        int i = 0;
        while (i < len){
            sumFirst += digits[i];
            i++;
        }
        int sumSecond = 0;
        int j = 0;
        do{
            sumSecond += digits[j];
            j++;
        } while(j < len);

        System.out.printf("sum1 = %d, sum2 = %d, равны = %b", sumFirst, sumSecond, sumFirst = sumSecond);
    }
}
