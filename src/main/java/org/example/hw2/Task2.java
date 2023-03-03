package org.example.hw2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения: ");
        Integer[] array = new Integer[10];
        int summa = 0;

        int a = scanner.nextInt();
        while (a != 0){
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                array = append(array, a);
            }
            a = b;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                summa += array[i];
            }
        }

        System.out.println(summa);
        scanner.close();
    }

    private static Integer[] append(Integer[] arr, int element)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new Integer[0]);
    }
}
