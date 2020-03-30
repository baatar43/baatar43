package Homework_Task;

public class Task_2 {
		public static void main(String[] args) {
			/*
			 * 1.	Write a java program to declare two 2 integer variables, and 
			 * 1 String variable, add and subtract the integers and print the values, put your 
			 * name in the string variable and print that after the addition and subtraction
			 * results.
			 */
			 int x = 10;
			 int y = 5;
			 int h = (x-y);
			 int k = x+y;
			 String z;
			 z = "Gungaa";
			 System.out.println(x);
			 System.out.println(y);
			 System.out.println(z);
			 System.out.println(x + y);
			 System.out.println(x - y);
			 System.out.println(h);
			 System.out.println(k);
			 /*
			  * 2.	Create two Boolean variables, assign some 
			  * values and print their values in the console. 
			  */
			 boolean a;
			 a = true;
			 System.out.println(a);
			 
			 /*
			  * 3.	Create a rent calculator program, when you will run the java program 
			  * it will take basic rent as input, utility as input, parking charge as input. 
			  * The program will calculate the total rent by adding them all and will print 
			  * the total rent at the end of the program.
			  */
			 int basic_rent;
			 int utility;
			 int parking_charge;
			 int total_rent;
			 basic_rent = 1000;
			 utility = 150;
			 parking_charge = 60;
			 total_rent = basic_rent + utility +parking_charge;
			 System.out.println("Monthly" +  total_rent);
			 
			 /*
			  * 4.	Create a java program to convert temperature from Fahrenheit to Celsius, 
			  * the formula of the conversion is as below
			  * Celsius_temparature = (farenhite_temperature - 32)*5)/9;
			  * Your program should take a farenhite temperature as input 
			  * and print the Celsius value for the temperature in the console. 
			  */
			 int Celsius_temparature;
			 int farenhite_temperature;
			 farenhite_temperature = 32;
			 Celsius_temparature = ((farenhite_temperature - 32)*5)/9;
			 
			 System.out.println(Celsius_temparature + "C");
		
			 /*
			  * 5.	Create the car price calculator by calculating 
			  * monthly payment for the car – the problem is to find 
			  * car monthly payment – where input of the system will be 
			  * base price, interest, Tax, admin fee, down payment, 
			  * duration of financing time (5/6/7 years). Interest should be 
			  * calculated by applying 3% interest rate on the base price subtracting 
			  * down payment, tax is 7% of the base total out of the door price. 
			  */
			 int basePrice = 10000;
			 double interestRate = .03;
				int downpayment = 1000; 
				int adminfee = 700; 
				double tax = 7/100;
				
				double taxprice ; 
				double totalprice; 
				double financeAmount; 
				double totalfinancAmount;
				 
				taxprice = (basePrice + adminfee)*tax; 
				totalprice = taxprice + basePrice + adminfee;
				
				
//				System.out.println(totalprice);
				
				financeAmount = totalprice - downpayment; 
				totalfinancAmount = financeAmount + (financeAmount*interestRate); 
				
//				System.out.println(financeAmount);
				
				double monthlypayment ; 
				
				monthlypayment = totalfinancAmount/60; 
				
				System.out.println(monthlypayment);
		}
		
}
