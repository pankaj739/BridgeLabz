package com.bridgelab.datastruture.com;

import java.util.Scanner;

import com.utility.Utility;

public class PalindromeChkViaDeque {
public static void main(String[] args) {
	Utility utility = new Utility();
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word to check palindrome");
	
	String word = sc.nextLine();
	boolean b = Utility.palindromCheaker(word);
	if(b)
	{
		System.out.println(" is Palindrome");
	}
	else {
		System.out.println(" is Not Palindrome");
	}
} 
}
