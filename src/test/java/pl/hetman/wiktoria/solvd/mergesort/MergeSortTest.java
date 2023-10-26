package pl.hetman.wiktoria.solvd.mergesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort() {
        //given
        MergeSort mergeSort = new MergeSort();
        int[] inputArr = {1, 7, 4, 9, 13, 34, 0, 3};
        int[] expectedArr= {0, 1, 3, 4, 7, 9, 13, 34};

        //when
        int[] sortedArray = mergeSort.sort(inputArr, 0, inputArr.length - 1);

        //then
        Assertions.assertArrayEquals(expectedArr, sortedArray, "Arrays are not equal");

    }
}