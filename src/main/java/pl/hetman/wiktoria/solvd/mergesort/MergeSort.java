package pl.hetman.wiktoria.solvd.mergesort;

public class MergeSort {

    public int[] sort(int[] arr, int lowIndex, int highIndex) {

        if (lowIndex < highIndex) {
            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            sort(arr, lowIndex, middleIndex);
            sort(arr, middleIndex + 1, highIndex);
            merge(arr, lowIndex, middleIndex, highIndex);
        }
        return arr;
    }

    private int[] merge(int arr[], int lowIndex, int middleIndex, int highIndex) {

        int[] leftArray = new int[middleIndex - lowIndex + 1];
        int[] rightArray = new int[highIndex - middleIndex];

        for (int i = 0; i < leftArray.length; ++i) {
            leftArray[i] = arr[lowIndex + i];
        }
        for (int j = 0; j < rightArray.length; ++j) {
            rightArray[j] = arr[middleIndex + 1 + j];
        }

        int i = 0, j = 0;
        int k = lowIndex;

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
