package com.utility;

import java.util.Arrays;

import com.bridgelab.datastruture.com.MyDeque;
import com.bridgelab.datastruture.com.Node;

public class Utility {
	public static void bubbleString(String[] arr) {
		String temp;
		System.out.println("Strings in sorted order: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[i])<0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println(arr[i]);
			
		}

	}

/////////////////////////////////////////////////////////////////////////////////////





public 	static  void sort(int arr[]) {
	
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int k=arr[i];
			int j=i-1;
			while(j>=0 &&arr[j]>k)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=k;
		}
	}


public	static void printArray(int arr[])
	{
		int n=arr.length;
		for(int i =0;i<n;++i)
		{
			System.out.print(arr[i]);
			System.out.println();
			
		}
	}






///////////////////////////////////////////////////////////
 

public static String[] sortSub(String array[],int f)
{
	String temp=" ";
	for(int i=0; i<f;i++)
	{
		for(int j=i+1;j<f;j++)
		{
			if(array[i].compareTo(array[j])>0) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	return array;
}

	
	////////////////////////////////////////////////////////
public static void tempConversionFtoC(double f)

{
   double c=(f-32)*5/9;
   System.out.println("c="+(f-32)*9/5);
}
public static void tempConversionCtoF(double c)
{
	double f=((9*c)/5)+32;
	System.out.println("f="+((c*9)/5)+32);
}

	
	
	/////////////////////////////////////////////////////////////////////////////
public static void paymentMonthly(double p,double R,double y)
{
	double n=12*y;
	double r=R/(12*100);
	
	 double payment=p*r/(1-(Math.pow((1+r), -n)));
	System.out.println("monthly payment is :"+payment);
			

}

////////////////////////////

public static void dayofweek(int m,int d,int y)
{
	int y0=y-(14-m)/12;
	int x=y0+y0/4-y0/100+y0/400;
	int m0=m+12*((14-m)/12)-2;
	int d0=(d+x+(31*m0)/12)%7;
	if(d==0)
	{
		System.out.println("Sunday");
	}
	if(d==1)
	{
		System.out.println("Monday");
		
	}
	if(d==2)
	{
		System.out.println("tuesday");
	}
	if(d==3)
	{
		System.out.println(" wednesday ");
	}
	if(d==4)
	{
		System.out.println(" thursday ");
	}
	if(d==5)
	{
		System.out.println(" friday ");
	}
	if(d==6)
	{
		System.out.println(" saturday ");
	}
	if(m==1 && m<=12)
	{
		System.out.println(" valid month");
		
	}
	if(y==0 && y>=1000000)
	{
		System.out.println("valid year");
	}
	
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void sqrt(double c)
{
	double t=c;
	double epsilon=1e-15;
	while(Math.abs(t-c/t)>epsilon*t) {
		t=(c/t+t)/2;
		
	}
	System.out.println(t);
}
///////////////////////////////////////////////////////////////////////////////////////////////////


public static void countcurrency(int amount)
{
	

int[] notes = new int[]{2000,500,200,100,50,20,10,5,2,1};
int[] countnotes=new int[10];
for(int i=0;i<10;i++)
{
	if(amount>=notes[i])
	{
		countnotes[i]=amount/notes[i];
		amount=amount-countnotes[i]*notes[i];
		
		
	}
	if(countnotes[i]!=0) {
		System.out.println(notes[i]+":"+countnotes[i]);
	}
}
}

/////////////////////////////////////////////////////////////////////////////////////////////


public static void toBinary(int d)
{
	String bin=" ";
	while(d!=0) {
		bin=(d%2)+bin;
		d/=2;
	}
	while(bin.length()%4==0) {
		bin=0+bin;
		
	}
	
	System.out.println("binary number is:" +bin); 
}


//////////////////////////////////////////////////////////////////////////////

public static int[] stringToIntArray(String bin) {
int[] binary=new int[bin.length()];
for(int i=0;i<binary.length;i++) {
	binary[i]=bin.charAt(i)-48;
}
return binary;
}
public static void showArr(int[] arr){
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
}
	
public static boolean powerOf2(int n) {
	int i=0;
	int temp=0;
	temp=(int)Math.pow(2, i);
	while(temp<n) {
		return true;
	}
	i++;

return false;
}
public static int[] swapNibbles(int[] arr) {
	int temp,j=arr.length-4;
	for(int i=0;i<4;i++) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j++;
	}
	return arr;
}


public static int toDecimal(int[] binary) {
	// TODO Auto-generated method stub
	return 0;
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void bubbleSort(int[] arr) {
	for(int i=0;i<arr.length-1;i++) {
		int temp;
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				 temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		System.out.println();
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	
	public static void binarySearch(int[] arr,int first,int last,int k) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]<k) {
				first=mid+1;
			}
			else if(arr[mid]==k) {
			System.out.println(" Element is found at index :"+mid);
			break;
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println(" Element is not found ");
			
		}
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
public static int stringBinarySearch(String[] arr,int min,int max,String k) {
	 min=0;
	 max=arr.length-1;
	 int mid;

	while(min<=max) {
		mid=(min+max)/2;
		if(arr[mid].compareTo(k)<0) {
			min=mid+1;
		}
		else if(arr[mid].compareTo(k)>0) {
			max=mid-1;
			
		}else {
			return mid;
		}}
	return-1;
}


	////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			





	public static boolean anagramChk(String s1, String s2) { 
		char[] charArray1=s1.toCharArray();
	    char[] charArray2=s2.toCharArray();
	    Arrays.sort(charArray1);
	    Arrays.sort(charArray2);
	    return Arrays.equals(charArray1,charArray2);
	    
	}

	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public static void prime() {
	int i,j;
    System.out.print("Prime nos from 0 to 100 are 1,2,");

    for(i=3;i<=1000;i++)
    {
              for(j=2;j<i;j++)
              {
                        if(i%j==0)
                        break;
              }

              if(i==j) {
            	  System.out.print(i+",");
              }  
              }
          
}


    
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
public static void primeAnagrams() {
	ArrayList<Integer> ar = new ArrayList<Integer>();
	System.out.println();
	boolean b;
	for (int j = 2; j <= 1000; j++) {
		b = true;
		for (int i = 2; i < j / 2; i++) {
			if (j % i == 0) {
				b = false;
				break;
			}
		}
		if (b)
			ar.add(j);
	}
	for (int i = 0; i < ar.size(); i++) {
		for (int j = i + 1; j < ar.size(); j++) {
			if (anagram(ar.get(i), ar.get(j))) {
				System.out.println(ar.get(i) + "  " + ar.get(j));
			}
			
*/		
			
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    
public static void insertionString(String[] arr) {
	String temp;
	for (int i =0; i < arr.length; i++) {
		for (int j =1; j<arr.length; j++) {
			if(arr[j].compareTo(arr[j-1])<0) {
				temp=arr[j-1];
				arr[j-1]=arr[j];
				
				arr[j]=temp;
			}
			
			
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
}


	
	
	

    
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    



    
    
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
public static boolean palindromCheaker(String word)
{
	MyDeque<Character> dq=new MyDeque<Character>();
	char[] c=word.toCharArray();
	for(int i=0;i<c.length;i++) {
		dq.addFront(c[i]);
	}
	String s="";
	for(int i=0;i<c.length;i++)
	{
		Node<Character> ch=dq.removeFront();
		s=s+ch.data;
	}
	System.out.println(s);
	if(s.equals(word))
	{
		return true;
	}else
	{
		return false;
	}
}



	/////////////////////////////////////////////////////////////////////////////////////////////////////////
public static boolean isPrime(int number) {
	int count = 0;
	for (int i = 2; i <= number / 2; i++) {
		if (number % i == 0) {
			count++;
		}
	}
	if (count == 0) {
		return true;}
	else {
		return false;}}





public static void prime2DArray() {
	int[][] array = new int[10][100];
	int[][] prime = new int[10][100];
	int z=1;
	for(int i=0;i<10;i++) {
		for(int j=0;j<100;j++) {
			array[i][j]=z;
			z++;
		}
	}
	for(int i=0;i<10;i++) {
		for(int j=0;j<100;j++) {
			if(isPrime(array[i][j])) {
				prime[i][j]=array[i][j];
			}else {
				prime[i][j]=-1;
				
			}
		}
	}
	for(int i=0;i<10;i++) {
		for(int j=0;j<100;j++) {
			if(prime[i][j]!=-1) {
				System.out.println(prime[i][j] +"  ");
				
			}
	
		}
	}
}}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	

	
	
	
	
	
	
	
	
	

		
	


















	
	





























	
	
	
	
	
	
	
	
	
	