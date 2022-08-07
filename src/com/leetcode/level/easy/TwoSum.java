/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?*/

package com.leetcode.level.easy;

import java.util.Scanner;

public class TwoSum {

	static int[] outputArray = new int[2];

	public static int[] twoSum(int[] inputNums1, int target) {

		for (int i = 0; i < inputNums1.length; i++) {
			for (int j = i + 1; j < inputNums1.length; j++) {
				if (inputNums1[i] + inputNums1[j] == target) {
					outputArray[0] = i;
					outputArray[1] = j;
					return outputArray;
				}
			}
		}
		return outputArray;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input target:");
		int target = sc.nextInt();

		sc.close();

		int[] inputNums1 = { 2, 7, 11, 15 };
		int[] inputNums2 = { 3, 2, 4 };
		int[] inputNums3 = { 3, 3 };

		System.out.println(twoSum(inputNums1, target));

	}

}
