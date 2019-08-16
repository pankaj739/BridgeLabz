package com.bridgelab.algorithm_program;

import java.util.Scanner;

import com.utility.Utility;

public class VendingMachine {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter amount : ");
		int amount =sc.nextInt();
		Utility u=new Utility();
		u.countcurrency(amount);
	}

}
