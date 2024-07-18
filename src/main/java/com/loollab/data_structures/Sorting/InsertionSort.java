package com.loollab.data_structures.Sorting;

/**
 * @author sskma
 * @Created 18/07/2024 - 1:09 AM
 * @project data_structures
 */
public class InsertionSort {

    public static Integer[] sort(Integer[] array,Integer arraySize)
    {
        for (var i = 1; i< arraySize; i++){
            var key = array[i];
            var j = i-1;
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
