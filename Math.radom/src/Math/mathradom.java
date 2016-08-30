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
			    System.out.println("How many questions do you want to practise, " + name + "?" );
			    numberOfQuestions = userInput2.nextInt();

			}

	}
