package com.example.wangzhibo.lovestudy.codeinterview;

/**
 * 排序类
 * Created by samwangzhibo on 2019/1/19.
 */

public class SortTest {

    public static void main(String[] args) {
        int[] nums = {100, 23, 354, 435, 65, 99};

//        quickSort(nums, 0, nums.length-1);
        bobbleSort(nums);

        for (int i : nums){
            System.out.println(i+"");
        }
    }

    private static void bobbleSort(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for (int j=0; j<nums.length-1-i; j++){
                if (nums[j] > nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    private static void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int index = findIndex(nums, start, end);
        quickSort(nums, start, index - 1);
        quickSort(nums, index + 1, end);
    }

    private static int findIndex(int[] nums, int start, int end) {
        int num = nums[start];
        while (start < end){
            while (nums[end] > num && start < end){
                end--;
            }
            nums[start] = nums[end];
            while (nums[start] < num && start < end){
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = num;
        return start;
    }
}
