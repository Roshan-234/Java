package com.roshan;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {5,3,2,2,3,1};
        int val = 3;
        int res = removeElement(nums,val);
        System.out.println(res);
    }

    public static int removeElement(int[] nums, int val) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[t] = nums[i];
                t++;
            }
        }
        return t;
    }
}
