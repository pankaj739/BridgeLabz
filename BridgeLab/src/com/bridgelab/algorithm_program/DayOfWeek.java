package com.bridgelab.algorithm_program;

import java.util.Scanner;

import com.utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the month : ");
		int m=sc.nextInt();
		System.out.println(" Enter the day : ");
		int d=sc.nextInt();
		System.out.println(" Enter the year : ");
		int y=sc.nextInt();
		Utility u=new Utility();
		u.dayofweek(m, d, y);
	}

}
