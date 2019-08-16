package com.bridgelab.algorithm_program;

import java.util.Scanner;

import com.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter 1st string: ");
		String s1=sc.nextLine();
		System.out.println(" Enter 2nd string: ");
		String s2=sc.nextLine();
		Utility u=new Utility();
	
		boolean ans=u.anagramChk(s1,s2);
		 System.out.println("both string are anagram is : "+  ans);
	}

}
