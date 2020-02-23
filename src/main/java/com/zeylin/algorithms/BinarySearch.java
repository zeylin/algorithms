package com.zeylin.algorithms;

/**
 * Binary search, recursive implementation.
 *
 * Complexity: O(log n)
 */
public class BinarySearch {

    /**
     * Search for an index of the element in a sorted array.
     * @param array sorted array
     * @param element element that needs to be found
     * @param left left index to start searching from
     * @param right right index
     * @return index of the element in an array, if found; otherwise, -1 if not found.
     */
    public static int binarySearch(int[] array, int element, int left, int right) {
        if (left > right) {
            return  -1;
        }

        int middle = (left + right) / 2;
        if (array[middle] == element) {
            return middle;
        }  else if (array[middle] > element) {
            return binarySearch(array, element, left, middle - 1);
        } else {
            return binarySearch(array, element, middle + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,4,7,9,11,15,18};
        int lastIndex = array.length - 1;

        int index = binarySearch(array, 1, 0, lastIndex);
        System.out.println("index = " + index);
    }

}
