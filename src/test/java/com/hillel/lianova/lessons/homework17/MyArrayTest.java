package com.hillel.lianova.lessons.homework17;

import com.hillel.lianova.lessons.homework17.main.MyArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyArrayTest {
    MyArray myArray = new MyArray();

    @Test
    public void testAverageArray() {
        int[] array = new int[]{1, 3, 4, 6, 8};
       Assertions.assertEquals(4.4, myArray.averageArray(array));
    }

    @Test
    public void testCheckSquareArray() {
        int[][] array = {
                {3, 4, 6, 7},
                {9, 4, 5, 9},
                {3, 3, 3, 7},
                {0, 4, 5, 6}
        };
        Assertions.assertTrue(myArray.checkSquareArray(array));
    }
}

