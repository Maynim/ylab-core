package ru.maynim.lecture_1.task_2;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};

        printArray(array);
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] array, int firstElement, int lastElement) {
        if (array.length == 0) {
            return;
        }

        int leftMarker = firstElement;
        int rightMarker = lastElement;

        int pivot = array[(leftMarker + rightMarker) / 2];

        while (leftMarker <= rightMarker) {
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    exchange(array, leftMarker, rightMarker);
                }

                leftMarker++;
                rightMarker--;
            }
        }

        if (leftMarker < lastElement) {
            quickSort(array, leftMarker, lastElement);
        }
        if (firstElement < rightMarker) {
            quickSort(array, firstElement, rightMarker);
        }
    }

    private static void exchange(int[] array, int leftMarker, int rightMarker) {
        int temp = array[leftMarker];
        array[leftMarker] = array[rightMarker];
        array[rightMarker] = temp;
    }
}
