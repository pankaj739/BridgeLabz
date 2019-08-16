package com.bridgelab.functional_program;

import java.util.Scanner;

public class UserName {
	public static void primeFactor(int n)
	{
		while(n%2==0)
		{
			System.out.println(2 + " ");
			n/=2;
		}
		for(int i=3;i<=Math.sqrt(n); i+=2)
		{
			while(n%i==0)
			{
				System.out.print(i + " ");
			n/=i;
			}
		}
	
	if(n>2)

		System.out.print(n);
	}
	public static void main(String args[])
	{
         Scanner sc=new Scanner(System.in);
         System.out.print(" enter any number :");
         int n = sc.nextInt();
         primeFactor(n);
	}
	


}
