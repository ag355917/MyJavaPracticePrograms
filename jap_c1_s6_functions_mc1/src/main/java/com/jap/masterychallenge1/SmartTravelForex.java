package com.jap.masterychallenge1;

import java.util.Scanner;

public class SmartTravelForex {

    /**
     * This method converts the given amount in INR to the currency of choice
     * @param amount
     * @param choice
     * @return the exchange rate depending on choice of currency
     */
    public static double currentExchangeRates(double amount, int choice) {
    	if(choice<0||amount<0) {
    		System.out.println("Enter a non negative number as amount");
    		return -1;
    	}
    	switch(choice) {
    	case 1:double JPY=.67;
    			return JPY*amount;
    	case 2:double EUR=85.37;
				return EUR*amount;
		case 3:double GBP=94.5;
		 		return GBP*amount;
		case 4:double USD=74.3;
				return USD*amount;
		case 5:double AED=20.25;
				return AED*amount;		
    	}
    	
       return -1;
    }

    /**
     * This method converts a given source currency to the desired target currency
     * @param sourceCurrency
     * @param targetCurrency
     * @param amountToBeConverted
     * @return converted amount from a source currency to the desired target currency
     */

    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted) {
//    	double valueINR=currentExchangeRates(amountToBeConverted,sourceCurrency);
//    	System.out.println(valueINR);
    	if(sourceCurrency==targetCurrency) {
    		return -1;
    	}
    	switch(targetCurrency) {
    	case 1:double JPY=.67;
    			return currentExchangeRates(amountToBeConverted, sourceCurrency)/JPY;
    	case 2:double EUR=85.37;
				return currentExchangeRates(amountToBeConverted, sourceCurrency)/EUR;
		case 3:double GBP=94.5;
		 		return currentExchangeRates(amountToBeConverted, sourceCurrency) /GBP;
		case 4:double USD=74.3;
				return currentExchangeRates(amountToBeConverted, sourceCurrency)/USD;
		case 5:double AED=20.25;
				return currentExchangeRates(amountToBeConverted, sourceCurrency)/AED;		
    	}
    	
    	
           return -1;
    }

    /**
     *  This method displays the currency conversion rates in a tabular format
     *
     */
    public static void displayForexDetails() {
//    	my start
    	System.out.println("The exchange rates for each currency (1,10,20,50,100) in INR ");
    
    	System.out.printf("%25d %15d %15d%15d %15d\n", 1, 10, 20,50,100); 
    	System.out.print("JPY");
    	float JPY=.67f;
    	System.out.printf("%25.2f %15.2f %15.2f%15.2f %15.2f\n", JPY, 10*JPY, 20*JPY,50*JPY,100*JPY); 
    	System.out.print("EUR");
    	float EUR=85.37f;
    	System.out.printf("%25.2f %15.2f %15.2f%15.2f %15.2f\n", EUR, 10*EUR, 20*EUR,50*EUR,100*EUR); 
    	System.out.print("GBP");
    	float GBP=94.5f;
    	System.out.printf("%25.2f %15.2f %15.2f%15.2f %15.2f\n", GBP, 10*GBP, 20*GBP,50*GBP,100*GBP);
    	System.out.print("USD");
    	float USD=74.3f;
    	System.out.printf("%25.2f %15.2f %15.2f%15.2f %15.2f\n", USD, 10*USD, 20*USD,50*USD,100*USD);
    	System.out.print("AED");
    	float AED=20.25f;
    	System.out.printf("%25.2f %15.2f %15.2f%15.2f %15.2f\n", AED, 10*AED, 20*AED,50*AED,100*AED); 
    	

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int source = 0;
        int target = 0;
        double amountToBeConverted = 0;
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
            source=sc.nextInt();
            
            
            // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
//            source = 0;
            System.out.println("Enter the target currency(Currency I want) : ");
            target=sc.nextInt();
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
//            target = 0;
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
//            amountToBeConverted = 0;
            amountToBeConverted=sc.nextDouble();
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        } else {
            System.out.println("Thanks for checking into currency convertor");
        }
    }

}
