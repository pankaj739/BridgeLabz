package com.bridgelab.algorithm_program;

import java.util.Scanner;

import com.utility.Utility;

public class IncomeAmount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter principal amout : ");
		double p=sc.nextDouble();
		System.out.println(" Enter rate of interest : ");
		double R=sc.nextDouble();
		System.out.println(" Enter value of year : ");
		double y=sc.nextDouble();
		Utility u=new Utility();
		u.paymentMonthly(p, R, y);
		
	}

}
