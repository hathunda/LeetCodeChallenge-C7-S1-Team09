package com.bptn.leetcode._3_missing_number;

import java.util.Arrays;
import java.util.stream.IntStream;


public class MissingNumber {

	public static void main(String[] args) {
		
		//int[] integers = new int[] { 3, 0, 1 }; // Test case 1
		//int[] integers = new int[] { 0,1 }; // Test case 2
		int[] integers = new int[] { 9,6,4,2,3,5,7,0,1 }; // Test case 3
		
		MissingNumber find = new MissingNumber();
		int num = find.missingNumber(integers);

		System.out.println(num);

	}

	public int missingNumber(int[] nums) {

		int missedNum = 0;

		// count the elements in the array
		int arrSize = nums.length;

		// check if that array size number is present in the array
		boolean isNumPresent = IntStream.of(nums).anyMatch(x -> x == arrSize);

		// sort the numbers in the array
		Arrays.sort(nums);

		// check if that array size number is present in the array
		if (isNumPresent) {
			// find the diff between the num at current index and the num at i + 1
			for (int i = 0; i < nums.length - 1; i++) {

				int nextIdx = i + 1;
				// if the diff is not equal to 1, there is a missing number
				if ((nums[nextIdx] - nums[i]) != 1) {
					missedNum = nums[i] + 1;
				}
			}
		} else {
			// if that array size number is not present in the array return that num
			missedNum = arrSize;
		}

		return missedNum;
	}

}
