package com.bridgelab.algorithm_program;

import com.utility.Utility;

public class BinarySearchString {
public static void main(String[] args) {
		
		String[] arr= {"aaa","bbb","ccc","ddd","eeee","fff","ggg"};
		String k="ccc";
	
		Utility u=new Utility();
		
	int ans=	u.stringBinarySearch(arr, 0, arr.length-1, k);
		System.out.println("position of "+ k+" is "+ans );
	}


}
