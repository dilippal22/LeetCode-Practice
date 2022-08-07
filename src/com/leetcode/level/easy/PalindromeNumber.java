package com.leetcode.level.easy;

import java.util.Scanner;

public class PalindromeNumber {

	public static boolean isPalindrome(int inputNumber) {
		int temp = inputNumber;
		int sum = 0;

		while (inputNumber > 0) {
			sum = (sum * 10) + inputNumber % 10;
			inputNumber = inputNumber / 10;
		}

		if (temp == sum) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input number:");
		int inputNumber = sc.nextInt();

		sc.close();

		isPalindrome(inputNumber);
	}

}
