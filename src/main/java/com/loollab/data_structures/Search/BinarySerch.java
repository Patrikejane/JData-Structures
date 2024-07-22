package com.loollab.data_structures.Search;

/**
 * @author sskma
 * @Created 23/07/2024 - 1:28 AM
 * @project data_structures
 */
public class BinarySerch {

    public static int iterate_search ( Integer[] array, Integer number ) {

        Integer left = 0, right = array.length - 1;

        while (left <= right) {

            Integer mid = left + (right - left) / 2;

            if (array[mid].equals ( number )) {
                return mid;
            }

            if (array[mid] > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int recursive_search ( Integer[] array, Integer number, Integer left, Integer right ) {

        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (array[mid].equals ( number )) {
                return mid;
            }

            if (array[mid] > number) {
                right = mid - 1;
                return recursive_search ( array, number, left, mid - 1 );
            }
            return recursive_search ( array, number, mid + 1, right );


        }
        return -1;
    }


}
