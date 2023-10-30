package org.example;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] values = new int[]{1, 5, 2, 8, 3, 10};
        System.out.println("Исходный вид массива: " + Arrays.toString(values));
        quickSort(values);
        System.out.println("После применения быстрой сортировки: " + Arrays.toString(values));
    }

    private static void quickSort(int[] array) {

    }

}
