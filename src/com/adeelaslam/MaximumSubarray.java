package com.adeelaslam;

public class MaximumSubarray {
    
    static int max = Integer.MIN_VALUE;
    static int hi = 0;
    static int low = 0;

    public static void main(String[] args) {
        int[] nums = {3, 7, 4, 1, 6, 7, 8, 4};
        System.out.println("Maximum Subarray is ");
        maximumSubArray(nums, 0, 7);
        for(int i = low; i <= hi; i++) {
            System.out.print("" + nums[i] + " ");
        }

    }
    public static void maximumSubArray(int[] array, int beginIndex, int endIndex) {
        int stepSum = 0;
        if(beginIndex < endIndex) {
            for(int i = beginIndex; i <= endIndex; i++) {
                stepSum += array[i];
            }
            if(stepSum > max) {
                low = beginIndex;
                hi = endIndex;
                max = stepSum;
            }
            if(beginIndex + 1 != endIndex)
                maximumSubArray(array, beginIndex + 1, endIndex);
            if(endIndex - 1 != beginIndex)  
                maximumSubArray(array, beginIndex, endIndex - 1);
        }
    }

}
