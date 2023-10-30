package org.example;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] values = {1, 5, 9, 2, 8, 3, 10};
        System.out.println("Исходный вид массива: " + Arrays.toString(values));
        quickSort(values, 0, values.length-1);
        System.out.println("После применения быстрой сортировки: " + Arrays.toString(values));
    }

    private static void quickSort(int[] array, int from, int to) {
        if (from >= to) {
            return;
        }

        int middleValue = (from + to) / 2;
        int pivot = array[middleValue];
        int leftMarker = from;
        int rightMarker = to;

        while (leftMarker <= rightMarker) {
            if (array[leftMarker] < pivot) {
                leftMarker++;
            }
            if (array[rightMarker] > pivot) {
                rightMarker--;
            }

                int swap = array[leftMarker];
                array[leftMarker] = array[rightMarker];
                array[rightMarker] = swap;
                leftMarker++;
                rightMarker--;

        }
        if (from < rightMarker) {
            quickSort(array, from, leftMarker);
        }

        if (to > leftMarker) {
            quickSort(array, rightMarker, to);
        }
    }
}
