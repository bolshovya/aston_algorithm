package org.example;

public class BinarySearch {

    public static void main(String[] args) {
        int[] values = new int[]{1, 5, 2, 8, 3, 10};
        int valueToFind = 3;

        System.out.println("Индекс искомого значения " + valueToFind + " равен: " + binarySearch(values, valueToFind));
    }

    private static int binarySearch(int[] array, int valueToFind) {
        int index = -1;

        int lowValue = 0;
        int highValue = array.length - 1;

        while (lowValue <= highValue) {
            int middleValue = lowValue + (highValue - lowValue) / 2;
            if (valueToFind < array[middleValue]) {
                highValue = middleValue - 1;
            } else if (valueToFind > array[middleValue]) {
                lowValue = middleValue + 1;
            } else if (valueToFind == array[middleValue]) {
                index = middleValue;
                break;
            }
        }
        return index;
    }

}
