package com.adeelaslam;

import com.adeelaslam.MergeSort;
import com.adeelaslam.BinarySearch;

public class TwoSum {

    public static int [] twoSum(int[] nums, int target) {
        MergeSort.mergeSort(nums, 0, nums.length - 1);
        int result[] = new int[2];

        for(int i = 0; i < nums.length; i++) {
            result[0] = i;
            result[1] = BinarySearch.binarySearch(nums, target - nums[i]);
            if(result[1] != -1){
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums= {3, 3};
        int target = 6;
        int[] result = new int[2];
        result = twoSum(nums, target);
        System.out.println("Pair of numbers is (" + result[0] + ", " + result[1] + ")");
    }
    
    
}
