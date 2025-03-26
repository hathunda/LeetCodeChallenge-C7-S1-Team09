package com.bptn.leetcode._1_average_salary;

import java.util.Arrays;

public class AverageSalary {
	
	public static void main(String[] args) {
		int[] integers = new int[] { 4000, 3000, 1000, 2000 }; // Test case 1
		// int[] integers = new int[] { 1000, 2000, 3000 }; // Test case 2
		AverageSalary averageSalary = new AverageSalary();
		double average = averageSalary.average(integers);

		System.out.println(average);
	}

	// method to calculate the average salary of employees excluding the minimum and
	// maximum salary.
	public double average(int[] salary) {
		// Initialize sum to store the total sum of valid salaries
		double sum = 0.0;

		// Counter to track the number of valid salary entries
		int count = 0;

		// Find the minimum salary in the array
		int min = Arrays.stream(salary).min().getAsInt();

		// Find the maximum salary in the array
		int max = Arrays.stream(salary).max().getAsInt();

		// Iterate through each salary in the given array of salaries
		for (int x : salary) {
			// Include only salaries that are not the minimum or maximum
			if (x > min && x < max) {
				count++; // Increase the count of valid salaries
				sum += x; // Add to the sum variable
			}
		}

		// Calculate the average of valid salaries
		double average = sum / count;

		// Return the average salary
		return average;
	}

}

/*
 * PSEUDO-CODE
 * 
 * Algorithm Calculate Average Salary(salary)
 * 
 * // Step 1: Initialize variables sum = 0.0 count = 0
 * 
 * // Step 2: Find minimum and maximum salary in the array min = find minimum
 * value in salary array max = find maximum value in salary array
 * 
 * // Step 3: Iterate through given array of salaries For each x in salary do:
 * If x > min AND x < max then: count = count + 1 // Increment valid salary
 * count sum = sum + x // Add valid salary to sum
 * 
 * // Step 4: Calculate the average of valid salaries average = sum / count
 * 
 * // Step 5: Return the calculated average Return average
 * 
 * End Algorithm
 * 
 * 
 */
