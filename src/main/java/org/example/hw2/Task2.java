package org.example.hw2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения: ");
        int sum = 0;

        int a = scanner.nextInt();
        while (a != 0){
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                sum += a;
            }
            a = b;
        }

        System.out.println(sum);
        scanner.close();
    }

}
