/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.*/

package com.leetcode.level.easy;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] inputStringArray1) {

		for (int i = 0; i < inputStringArray1.length; i++) {
			String firstWord = inputStringArray1[i];
			
			for (int j = i + 1; j < inputStringArray1.length; j++) {
				String secondWord = inputStringArray1[j];
				
				for (int k = j + 1; j < inputStringArray1.length; k++) {
					String thirdWord = inputStringArray1[k];
					
					if(firstWord.charAt(i) == secondWord.charAt(i)){
						
						
					}
					
				}
			}

		}
		return null;

	}

	public static void main(String[] args) {

		String[] inputStringArray1 = { "flower", "flow", "flight" };
		String[] inputStringArray2 = { "dog", "racecar", "car" };

		longestCommonPrefix(inputStringArray1);
	}

}
