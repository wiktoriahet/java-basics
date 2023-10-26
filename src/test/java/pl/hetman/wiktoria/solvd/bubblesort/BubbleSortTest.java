package pl.hetman.wiktoria.solvd.bubblesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        //given
        BubbleSort bubbleSort = new BubbleSort();
        int[] inputArr = {1, 7, 4, 9, 13, 34, 0, 3};
        int[] expectedArr= {0, 1, 3, 4, 7, 9, 13, 34};

        //when
        int[] sortedArray = bubbleSort.bubbleSort(inputArr);

        //then
        Assertions.assertArrayEquals(expectedArr, sortedArray, "Arrays are not equal");

    }
}