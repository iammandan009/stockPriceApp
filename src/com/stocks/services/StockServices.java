package com.stocks.services;
import  java.util.Arrays;

public class StockServices 

{

	public void sortAscending(double array[])
	{
	 
	 Arrays.sort(array);
	 
	 System.out.println("The Stock Prices in Ascending Order are");
	 
		 for(int i=0; i<array.length; i++)
		 {
			 System.out.print(array[i]+ " ");
			 
		 }
	 
	}
	
	
	public void sortDescending(double array[])
	{
		
		Arrays.sort(array);
		
		System.out.println("The Stock Prices in Descending Order are");
		
		int lengthOfArray= array.length;
		
		for(int j=(lengthOfArray-1);j>=0;j--)
		{
			System.out.print(array[j]+ " ");
		}
	}
	
	public void binarySearch(double array[], double key)
	
	{
		
		Arrays.sort(array);
		int result= Arrays.binarySearch(array, key);
		
		if(result >= 0)
		  System.out.println("The Stock of value " + key  + " is present");
		else System.out.println("The Stock of value " +key +  " is NOT present");
		  
		
		
		
	}
	
}
