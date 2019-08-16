package com.bridgelab.algorithm_program;

import java.util.Scanner;

public class QuestionNumber {
	static Scanner sc = new Scanner(System.in);

	public static int getGuessNum(int n) {
		int end = (int) Math.pow(2, n);
		end = end - 1;
		int start = 0;
		int mid = 0;
		System.out.println("guess the no between " + start + " to " + end);
		for (int i = 0; i < n; i++) {
			mid = (start + end) / 2;
			System.out.println("is your guess is less then " + mid + "? Yes/no :");
			String str = sc.next();
			if (str.equalsIgnoreCase("yes")) {
				end = mid;
			} else {
				start = mid;
			}
		}
		if (end - start == 1) {
			return start;
		}
		return mid;
	}
	public static void main(String[] args) {
		System.out.println("enter the no of que : ");
		int n = sc.nextInt();
		System.out.println("your number is : " + getGuessNum(n));
	}


}
