package Math;

import java.util.Scanner;

public class mathradom
	{
		static int numberOfQuestions;
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
			    System.out.println("What is your name?");
			    String name = userInput.nextLine();
			    System.out.println("Hello, " + name + "!");
			    Scanner userInput2 = new Scanner(System.in);
			    System.out.println("How many questions would you like to practise, " + name + "?" );
			    numberOfQuestions = userInput2.nextInt();

			}

		public static void q1(){
			System.out.println("Given int randomNumber = (int)(Math.random( ) * " + num1 + ") + " + num2 +";");
		}
	}
