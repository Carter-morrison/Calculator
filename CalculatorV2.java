package com.java.calculatorV2;
//package calculatorV2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class CalculatorV2

{
	public static void main(String[] parms)
	{
		String in1, in2, op, name;
		double var1, var2, answer;
		int error = 3;
		String again = "yes";
		DecimalFormat fmt = new DecimalFormat("0.###");
		Scanner scan = new Scanner(System.in);

	   if (parms.length > 0)
		    name = (parms[0]);
	   
	
	   else{
		    System.out.println("No command line parameters passed in." );
			System.out.println("Welcome to the calculator program!\nPlease input your name...");
			name = scan.nextLine();
	   }
		
	
		while (error > 0 && again.equalsIgnoreCase("yes"))
		{
			do
			{
				System.out.println("Hello " + name + "! Please enter your first number.");
				in1 = scan.nextLine();
				var1 = Double.parseDouble(in1);

				System.out.println("Please input your second number.");
				in2 = scan.nextLine();
				var2 = Double.parseDouble(in2);

			
				System.out.println("Please input a VALID operator. (+, -, * , /, % or ^ (^ = power)");
				op = scan.nextLine();

				switch (op)
				{
				case "^":
					answer = Math.pow(var1, var2);
					System.out.println(name + ", " + fmt.format(var1) + " " + op + " " + fmt.format(var2) + " = "
							+ fmt.format(answer));
					break;
				case "+":
					answer = (var1 + var2);
					System.out.println(name + ", " + fmt.format(var1) + " " + op + " " + fmt.format(var2) + " = "
							+ fmt.format(answer));
					break;

				case "-":
					answer = (var1 - var2);
					System.out.println(name + ", " + fmt.format(var1) + " " + op + " " + fmt.format(var2) + " = "
							+ fmt.format(answer));
					break;

				case "*":
					answer = (var1 * var2);
					System.out.println(name + ", " + fmt.format(var1) + " " + op + " " + fmt.format(var2) + " = "
							+ fmt.format(answer));
					break;

				case "/":
					answer = (var1 / var2);
					if (var2 == 0)
						System.out.println("You cannot divide by zero.");
					else
						System.out.println(name + ", " + fmt.format(var1) + " " + op + " " + fmt.format(var2) + " = "
								+ fmt.format(answer));

					break;

				case "%":
					answer = (var1 % var2);
					System.out.println(name + ", " + fmt.format(var1) + " " + op + " " + fmt.format(var2) + " = "
							+ fmt.format(answer));
					break;

				default:
					error--;
				{
					System.out.println("You MUST use a valid operator. You have " + error + " attempt(s) left");

				}

				}
				

				if (error > 0)
				{
					System.out.println("Would you like to make another calculation?(Yes or No)");
					again = scan.nextLine();
				} else
				{
					System.out.println("Please contact customer support.");
					again = "no";
				}
			} while (again.equalsIgnoreCase("yes"));
		}

		scan.close();

		System.out.println("Goodbye!");

	}
}