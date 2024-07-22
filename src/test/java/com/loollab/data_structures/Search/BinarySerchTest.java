package com.loollab.data_structures.Search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sskma
 * @Created 23/07/2024 - 1:32 AM
 * @project data_structures
 */
class BinarySerchTest {

    @Test
    public void testwithSortedArrayExistingItemLeftHalf() {
        Integer[] givenArray = {1, 2, 3, 4, 5};
        Integer givenInt = 4;
        Integer expected = 3;

        Integer actual = BinarySerch.iterate_search ( givenArray,givenInt);
        assertEquals ( expected, actual);
    }

    @Test
    public void testwithSortedArrayExistingItemRightHalf() {
        Integer[] givenArray = {1, 2, 3, 4, 5};
        Integer givenInt = 4;
        Integer expected = 3;

        Integer actual = BinarySerch.iterate_search ( givenArray,givenInt);
        assertEquals ( expected, actual);
    }

    @Test
    public void testwithSortedArrayNonExistingItem() {
        Integer[] givenArray = {1, 2, 3, 4, 5};
        Integer givenInt = 6;
        Integer expected = -1;

        Integer actual = BinarySerch.iterate_search ( givenArray,givenInt);
        assertEquals ( expected, actual);
    }



    @Test
    public void testRecursiveWithSortedArrayExistingItemLeftHalf() {
        Integer[] givenArray = {1, 2, 3, 4, 5};
        Integer givenInt = 4;
        Integer expected = 3;

        Integer actual = BinarySerch.recursive_search ( givenArray,givenInt,0,4);
        assertEquals ( expected, actual);
    }

    @Test
    public void testRecursiveWithSortedArrayExistingItemRightHalf() {
        Integer[] givenArray = {1, 2, 3, 4, 5};
        Integer givenInt = 4;
        Integer expected = 3;

        Integer actual = BinarySerch.recursive_search ( givenArray,givenInt,0,4);
        assertEquals ( expected, actual);
    }

    @Test
    public void testRecursiveWithSortedArrayNonExistingItem() {
        Integer[] givenArray = {1, 2, 3, 4, 5};
        Integer givenInt = 6;
        Integer expected = -1;

        Integer actual = BinarySerch.recursive_search ( givenArray,givenInt,0,4);
        assertEquals ( expected, actual);
    }


}