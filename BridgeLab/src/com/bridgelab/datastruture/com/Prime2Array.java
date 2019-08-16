package com.bridgelab.datastruture.com;

import java.util.Arrays;

public class Prime2Array {
	private static int[][] arr = new int[10][25];

	public static void getArray() {
		boolean flag = true;
		int row = 0;
		int col = 0;
		int n = 100;
		for (int i = 0; i < 1000; i++) {
			for (int j = 2; j <= (int) Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag && i != 0 && i != 1) {
				if (i <= n) {
					arr[row][col++] = i;
				} else {
					col = 0;
					arr[++row][col++] = i;
					n = n + 100;
				}
			}
			flag = true;
		}
	}

	public static void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	public static void main(String[] args) {
		getArray();
		display();

	}

}
