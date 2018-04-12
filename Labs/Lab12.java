/*
	Zhe Dong
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	Sample output with odd number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	
	Note:
	Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/

import java.util.Scanner;//missing in the original code

public class Lab12{

	public static void main(String[] args){//missing []

		Scanner input = new Scanner(System.in);//s in system was downward

		System.out.println("This program will check if a number"
			+ " is even or odd..."); //there were "" missing

		System.out.println("Please enter in a whole number...");//missing ; at the end of the line

		int num = input.nextInt();

		checkNums(num);//missing s after Nums to match the line below

	}

	public static void checkNums(double num){
		if(num % 2 == 0){
			System.out.println("Your number is even");
		}
		else{
			System.out.println("Your number is odd");
		}
		//oops...  still need to implement

		}
	}
//deleted the last } because it was extra