package com.bptn.leetcode._2_sorted_squares;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

//		generate an array for testing the sortedSquares method
		int[] num = new int[] { -4, -1, 0, 3, 10 };

//		create an instance of the solution
		Solution solution = new Solution();
		
//		run the num array through the sortedSquares method
		int[] squares = solution.sortedSquares(num);
		
//		print out the contents of the num array 
		System.out.println(Arrays.toString(squares));

	}

	
	public int[] sortedSquares(int[] nums) {
		
//		Loop through the array using a for loop
		for (int i = 0; i < nums.length; i++) {
			
//			inside the loop square each value by multiplying it by itself 
			nums[i] = nums[i] * nums[i];
		}
		
//		sort the resulting array
		Arrays.sort(nums);
		
//		return the array
		return nums;

	}

}
