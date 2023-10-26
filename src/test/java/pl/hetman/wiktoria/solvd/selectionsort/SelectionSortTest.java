package pl.hetman.wiktoria.solvd.selectionsort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sortAscending() {
        //given
        SelectionSort selectionSort = new SelectionSort();
        int[] inputArr = {1, 7, 4, 9, 13, 34, 0, 3};
        int[] expectedArr= {0, 1, 3, 4, 7, 9, 13, 34};

        //when
        int[] sortedArr = selectionSort.sortAscending(inputArr);

        //then
        Assertions.assertArrayEquals(expectedArr, sortedArr, "Arrays are not equal");

    }

    @Test
    void sortDescending() {
        //given
        SelectionSort selectionSort = new SelectionSort();
        int[] inputArr = {1, 7, 4, 9, 13, 34, 0, 3};
        int[] expectedArr= {34, 13, 9, 7, 4, 3, 1, 0};

        //when
        int[] sortedArr = selectionSort.sortDescending(inputArr);

        //then
        Assertions.assertArrayEquals(expectedArr, sortedArr, "Arrays are not equal");

    }
}