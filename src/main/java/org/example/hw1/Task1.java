package org.example.hw1;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user_words = scanner.nextLine().trim();
        String[] words = user_words.split(" ");
        reverseArray(words);
        System.out.println(Arrays.toString(words));
        scanner.close();
    }
    public static void reverseArray(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}
