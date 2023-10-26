package pl.hetman.wiktoria.solvd.mergesort;

public class MergeSort {

    public int[] sort(int[] arr, int left, int right) {

        if (left < right) {
            int middle = left + (right - left) / 2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
        return arr;
    }

    private int[] merge(int arr[], int low, int middle, int high) {

        int[] leftArray = new int[middle - low + 1];
        int[] rightArray = new int[high - middle];

        for (int i = 0; i < leftArray.length; ++i) {
            leftArray[i] = arr[low + i];
        }
        for (int j = 0; j < rightArray.length; ++j) {
            rightArray[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = low;

        while (i < leftArray.length && j < rightArray.length) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
        return arr;
    }

}
