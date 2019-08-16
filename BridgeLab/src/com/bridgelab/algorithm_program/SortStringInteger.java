package com.bridgelab.algorithm_program;

import java.util.Scanner;

import com.utility.Utility;

public class SortStringInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string element with space : ");
		String st=sc.nextLine();
		String str[]=st.split(" ");
		Utility u= new Utility();
		u.insertionString(str);
	}

}
