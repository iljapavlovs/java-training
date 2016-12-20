package javaTraining.module1;

import java.util.Random;

public class DecisionActivity {
	
	public static void main(String[] args) {
		
		// random integer number in range 0...9 is assigned to theNumber variable
		int theNumber = new Random().nextInt(10);

		System.out.println("theNumber value is "+ theNumber);

		/* TODO #1: Write snippet code which will output certain string depending on the 'theNumber' variable value
		* using IF statement
		* which will output "The value of theNumber is <random number>"
		*/

		// END TODO #1


		/* TODO #2: Write snippet code which will output certain string depending on the 'theNumber' variable value
		* using SWITCH statement
		* which will output "The value of theNumber is <random number>"
		* Print "The number is not a valid choice" if theNumber value is not in the range of 0...9
		*/

		// END TODO #2

	}
}
