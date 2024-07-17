package com.loollab.data_structures.Sorting;

/**
 * @author sskmal
 * @Created 17/07/2024 - 11:52 PM
 * @project data_structures
 */
public class BubbleSort {

    public static Integer[] sort(Integer[] array,Integer arraySize){
        for (var j = 0; j < arraySize -1; j++) {
            for (var i = 0; i < arraySize -1-j; i++) {
                if (array[i] > array[i + 1]) {
                    var temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
