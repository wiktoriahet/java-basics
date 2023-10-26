package pl.hetman.wiktoria.solvd.quicksort;

public class Quicksort {

    public int[] quickSort(int[] arr, int lowIndex, int highIndex) {

        if (lowIndex < highIndex) {

            int pivot = arr[highIndex];

            int leftPointer = lowIndex;
            int rightPointer = highIndex;

            while (leftPointer < rightPointer) {
                while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                    leftPointer++;
                }
                while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                    rightPointer--;
                }
                swap(arr, leftPointer, rightPointer);
            }
            swap(arr, leftPointer, highIndex);

            quickSort(arr, lowIndex, leftPointer - 1);
            quickSort(arr, leftPointer + 1, highIndex);

        }
        return arr;
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}


