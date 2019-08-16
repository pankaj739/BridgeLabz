package com.bridgelab.algorithm_program;

import java.util.Scanner;

import com.utility.Utility;

public class Tempearture {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Fahrenheit temperature : ");
		double f=sc.nextDouble();
		System.out.println(" Enter the celcius temperature : ");
		double c=sc.nextDouble();
		

		Utility u=new Utility();
		u.tempConversionFtoC(c);
		u.tempConversionCtoF(f);
		
	}

}
