package com.adeelaslam;

public class MaximumSubarray {
    
    static int max = Integer.MIN_VALUE;
    static int hi = 0;
    static int low = 0;

    public static void main(String[] args) {
        int[] nums = {3, 7, 4, 1, 6, 7, 8, 4};
        System.out.println("Maximum Subarray is ");
//        for(int i : maximumSubArray(nums)) {
//            System.out.print("" + i + " ");
//        }

    }
    public static int[] maximumSubArray(int[] array, int beginIndex, int endIndex) {
        int stepSum = 0;
        for(int i = beginIndex; i <= endIndex; i++) {
            stepSum += i;
        }
        if(stepSum > max) {
            max = stepSum;
            low = beginIndex;
            hi = endIndex;
        }
        int[] result = new int[array.length];
        return result;
    }

}
