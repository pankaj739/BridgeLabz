package com.bridgelab.algorithm_program;

import java.util.Scanner;

public class TaskSchudling {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of task : ");
	int task=sc.nextInt();
	int[] dead=new int[task];
	int[] min=new int[task];
	for(int i=0;i<min.length;i++) {
		System.out.println("task"+ i +"time");
		min[i]=sc.nextInt();
		System.out.println("task"+ i +"deadline");
		dead[i]=sc.nextInt();
	}
}
}
