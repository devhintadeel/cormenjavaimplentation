package com.adeelaslam;

public class LinearSearch {

    public static void main(String[] args) {
        int[] A = {3, 7, 4, 1, 6, 7, 8, 4};
        for(int searchValue = 0; searchValue < 10; searchValue++) {
            System.out.println("Value " + searchValue + " is found at index: " + linearSearch(A, searchValue));
        }
    }
    
    public static int linearSearch(int[] A, int searchValue) {
        int stepIndex = 0;
        int searchIndex = -1;
        for(int data : A) {
            if(data == searchValue) {
                searchIndex = stepIndex;
                break;
            }
            stepIndex++;
        }
        return searchIndex;
    }
    

}
