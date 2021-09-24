package com.stocks.main;
import java.util.Scanner;
import com.stocks.services.*;

public class Driver 
{

	public static void main(String[] args) 
	
	{
		int countTrue=0;
		int countFalse=0;
		Scanner usrInput = new Scanner(System.in);
		System.out.println("Please Enter the number of companies");
		
		int noOfCompanies = usrInput.nextInt();
		
		double[] stockPricesOfCompanies = new double[noOfCompanies];
		
		for(int i=0;i<noOfCompanies;i++)
		{
			
			System.out.println("Please Enter Current Stock Price of Company " + (i+1));
			stockPricesOfCompanies[i] = usrInput.nextDouble();
			System.out.println("Please enter whether company's stock price rose today compare to yesterday?");
			boolean stockPrice = usrInput.nextBoolean();
			if(stockPrice == true)
				countTrue=countTrue+1;
				else countFalse= countFalse+1;
		}
				
		System.out.println("Enter the operation you want to perform from below list.\n" + "1. Display the companies stock prices in ascending order.\n"
					
						   + "2. Display the companies stock prices in descending order.\n" + "3. Display the total no of companies for which stock prices rose today.\n"
				
						   + "4. Display the total no of companies for which stock prices declined today.\n" + "5. Search a specific stock price. \n"+ "--> Enter 0 to Exit.\n");
		   
		   
		int usrChoice = usrInput.nextInt();  
		switch(usrChoice) 
		{
		
		case 1:
				{
				StockServices asc = new StockServices();
				asc.sortAscending(stockPricesOfCompanies);
				
				}break;
				
		case 2:
				{
					StockServices dsc = new StockServices();
					dsc.sortDescending(stockPricesOfCompanies);
				  	
				}break;
				
		case 3:
				{
					System.out.println("Total no of companies whose stock price rose today :" + countTrue);
					
				}break;
				
		case 4:
				{
					System.out.println("Total no of companies whose stock price declined today :" + countFalse);
					
				}break;
				
		case 5:
			
				{
					System.out.println("Enter the Stock Price you want to Find");
					double usrKey= usrInput.nextDouble();
					StockServices value = new StockServices();
					value.binarySearch(stockPricesOfCompanies, usrKey);
					
				}break;
				
				
		case 0: 
				{
					System.out.println("Thanks for using the App. Hope your request was met");
					
				}break;
			
			   
		
		}
		
		usrInput.close();

	}

}
