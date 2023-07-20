package com.adeelaslam;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

	public static void main(String[] args) {
		Solution objSolution = new Solution();
        
        
        System.out.println("Debug remove elements");
        int nums15[] = {3, 2, 2, 3};
        System.out.println("Test case 1" + Arrays.toString(nums15) + ", " + 3);

        System.out.println("Number of elements left after removal are " + objSolution.removeElement(nums15, 3));
        System.out.println("Results after " + Arrays.toString(nums15));
        int nums16[] = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println("Test case 2" + Arrays.toString(nums16) + ", 2");

        System.out.println("Number of elements left after removal are " + objSolution.removeElement(nums16, 2));
        System.out.println("Results after " + Arrays.toString(nums16));

        int nums17[] = {1};
        System.out.println("Test case 3" + Arrays.toString(nums17) + ", 1");

        System.out.println("Number of elements left after removal are " + objSolution.removeElement(nums17, 1));
        System.out.println("Results after " + Arrays.toString(nums17));

        int nums18[] = {3, 3};
        System.out.println("Test case 4" + Arrays.toString(nums18) + ", 3");

        System.out.println("Number of elements left after removal are " + objSolution.removeElement(nums18, 3));
        System.out.println("Results after " + Arrays.toString(nums18));

        int[] nums = {-2, 0, 10, 19, 4, 6, -8};
        if(objSolution.checkIfExist(nums)) {
            System.out.println("In test case " + Arrays.toString(nums) + " double exists properly");
        }else {
            System.out.println("In test case " + Arrays.toString(nums) + " double does not exist");            
        }
	}

    public int removeElement(int[] nums, int val) {
        int elementsRemoved = 0;
        int temp = 0;
        int j = nums.length - 1;
            
        for(int i = 0; i < nums.length; ) {
            if(nums.length == 1) {
                if(nums[i] == val) {
                    elementsRemoved++;
                    return nums.length - elementsRemoved;
                }
            }
            if(i == nums.length - elementsRemoved) {
                break;
            }
            if(nums[i] == val) {
                elementsRemoved++;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j--] = temp;
            }else {
                i++;
            }
        }
        return nums.length - elementsRemoved;
    }
    
    public int removeDuplicates(int[] nums) {
        int removedElements = 0;
        int temp = 0;
        int j = nums.length - 1;
        if(nums.length < 2)
            return 1;
        for(int i = 1; i < nums.length - removedElements; ) {
            if(nums[i - 1] == nums[i]) {
                removedElements++;
                temp = nums[i];
                for(int k = i; k < j; k++) {
                    nums[k] = nums[k+1];
                }
                nums[j--] = temp;
            }else {
                i++;
            }
        }
        return nums.length - removedElements;
    }
    public boolean checkIfExist(int[] arr) {
        int arr1[] = new int[arr.length];
        arr1 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr1);
        int startIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) { 
                startIndex = Arrays.binarySearch(arr1, 0);
                if(Arrays.binarySearch(arr1, startIndex + 1, arr.length, arr[i] * 2) >= 0)
                    return true;
            }        
            else {
                if(Arrays.binarySearch(arr1, arr[i] * 2) >= 0)
                    return true;
            }
        }
        return false;
    }
    
}
