package Math;

import java.util.Scanner;

public class mathradom
	{
		static int numberOfQuestions;
		static int num1;
		static int num2;
		public static void main(String[] args)
			{
				boolean correctness;
				Scanner userInput = new Scanner(System.in);
			    System.out.println("What is your name?");
			    String name = userInput.nextLine();
			    System.out.println("Hello, " + name + "!");
			    Scanner userInput2 = new Scanner(System.in);
			    System.out.println("How many questions would you like to practise, " + name + "?" );
			    numberOfQuestions = userInput2.nextInt();
			    q1();
			    if(correctness == true){
			    	Scanner userInput3 = new Scanner(System.in);
			        int answer = userInput.nextLine();
				}
			    q2();
			    if(correctness == true){
			    	Scanner userInput4 = new Scanner(System.in);
				}
			}
		public static void q1(){
			random();
			System.out.println("Given int randomNumber = (int)(Math.random( ) * " + num1 + ") + " + num2 +";");			
		}
		public static void q2(){
			random();
			System.out.println("Given range " + num1 + " and " + num2 +" , what would the code for that be?");
		}
		public static void  random(){
	         num1 = (int)(Math.random()*10)+1;
	         num2 = (int)(Math.random()*10)+1;
	    }
	}
