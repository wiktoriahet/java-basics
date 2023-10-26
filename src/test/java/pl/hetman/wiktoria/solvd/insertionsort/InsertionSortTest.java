package pl.hetman.wiktoria.solvd.insertionsort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

    @Test
    void sort() {
        //given
        InsertionSort insertionSort = new InsertionSort();
        int[] inputArr = {1, 7, 4, 9, 13, 34, 0, 3};
        int[] expectedArr= {0, 1, 3, 4, 7, 9, 13, 34};

        //when
        int[] sortedArr = insertionSort.sort(inputArr);

        //then
        Assertions.assertArrayEquals(expectedArr, sortedArr, "Arrays are not equal");

    }
}