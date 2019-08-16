package com.bridgelab.algorithm_program;

import com.utility.Utility;

public class BinarySearchInteger {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int k=30;
		int last=arr.length-1;
		Utility u=new Utility();
		u.binarySearch(arr, 0, last, k);
	}

}
