package com.adeelaslam;

import com.adeelaslam.InsertionSort;

public class BinarySearch {

    public static void main(String[] args) {
        int[] A = { 3, 7, 4, 1, 6, 7, 8, 4 };

        InsertionSort.insertionSort(A);
        InsertionSort.printArray(A);
        for (
                int searchValue = 0; searchValue < 10; searchValue++
        ) {
            System.out.println("Value " + searchValue + " is found at index: " + binarySearch(A, searchValue));
        }
    }

    public static int binarySearch(int[] A, int searchValue) {
        int startIndex = 0;
        int endIndex = A.length - 1;
        int searchIndex;
        do {
            searchIndex = (int) Math.floor((startIndex + endIndex / 2));
            if(searchIndex >= A.length)
                return -1;
            if (
                searchValue == A[searchIndex]
            )
                return searchIndex;
            else {
                if (
                    searchValue > A[searchIndex]
                ) {
                    if(searchIndex == startIndex)
                        break;
                    startIndex = searchIndex;
                } else {
                    if(endIndex == searchIndex)
                        break;
                    endIndex = searchIndex;
                }
            }
        } while (
            startIndex < endIndex
        );
        if(A[searchIndex] == searchValue)
            return searchIndex;
        else
            return -1;
    }

}
