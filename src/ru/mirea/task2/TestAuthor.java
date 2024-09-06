package ru.mirea.task2;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = scan.next();

        System.out.printf("Введите почту: ");
        String email = scan.next();

        System.out.printf("Введите гендер: ");
        char gender = scan.next().charAt(0);


        Author author = new Author(name, email, gender);
        System.out.printf("Имя - %s\n", author.getName());
        System.out.printf("Почта - %s\n", author.getEmail());
        System.out.printf("Гендер - %s\n", author.getGender());


        System.out.printf("Введите новую почту: ");
        email = scan.next();
        author.setEmail(email);
        System.out.println(author.toString());

    }
}
