package Math;

import java.util.Scanner;

public class mathradom
	{
		static int numberOfQuestions;
		static int num1;
		static int num2;
		static int x;
		static int y;
		static int answerX;
		static int answerY;
	    static String name;  
	    static int score;
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
			    System.out.println("What is your name?");
			    name = userInput.nextLine();
			    System.out.println("Hello, " + name + "!");
			    Scanner userInput2 = new Scanner(System.in);
			    System.out.println("How many questions would you like to practise, " + name + "?" );
			    numberOfQuestions = userInput2.nextInt();
			    for (int i = 0; i < numberOfQuestions; i++){
			    	if (i%2 == 0){
		    	        q1();		    	
			    	} else {
			    		q2();			    		
			    	}
			    }
			    int percentage = score/numberOfQuestions;
			    if (percentage > .8) {
			    System.out.println("Good job! " + name + ", you got " + score + " out of " + numberOfQuestions + ".");
			    } else {
			    	System.out.println("Keep practicing, " + name + ", you got " + score + " out of " + numberOfQuestions + ".");
			    }
			    }
			   
		public static void q1(){
			random();
			System.out.println("Given \"int randomNumber = (int)(Math.random( ) * " + num1 + ") + " + num2 +";\" The numbers will generate between X and Y, inclusive.");	
			x = 0 + num2;
			y = num1 + num2 - 1;			
	        feedBack();
		}
		public static void q2(){
			random();
			System.out.println("Given range " + num1 + " and " + num2 +" , the code to generate number within this range would be \" int randomNumber = (int)(Math.random( ) * X) + Y; \"");
			x = num2 - 1 - num1;
			y = num1;
			feedBack();
		}
		public static void feedBack(){
			Scanner userInput1 = new Scanner(System.in);
	    	System.out.println("What is the value of X?");
	        answerX = userInput1.nextInt();
	        Scanner userInput2 = new Scanner(System.in);
	    	System.out.println("What is the value of Y?");
	        answerY = userInput2.nextInt();
			if ((answerX == x) && (answerY == y)){
				System.out.println("You are right, " + name + "!");
				score++;
			} else {
				System.out.println("Sorry, " + name + "you are wrong.");
			}
		}
		public static void  random(){
	         num1 = (int)(Math.random()*10)+1;
	         num2 = (int)(Math.random()*10)+1;
	    }
	}
