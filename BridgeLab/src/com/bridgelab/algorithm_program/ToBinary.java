package com.bridgelab.algorithm_program;

import java.util.Scanner;

import com.utility.Utility;

public class ToBinary {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter any decimal number: ");
		int d=sc.nextInt();
		
		
		Utility u=new Utility();
		u.toBinary(d);
		
		
	}
}
