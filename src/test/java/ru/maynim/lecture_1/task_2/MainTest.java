package ru.maynim.lecture_1.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static final int[] INPUT_ARRAY = {5, 6, 3, 2, 5, 1, 4, 9};
    private static final int[] EXPECTED_ARRAY = {1, 2, 3, 4, 5, 5, 6, 9};

    @Test
    void shouldSortTheArray() {
        Main.quickSort(INPUT_ARRAY, 0, INPUT_ARRAY.length - 1);

        assertArrayEquals(EXPECTED_ARRAY, INPUT_ARRAY);
    }
}