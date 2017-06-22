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
		if(theNumber == 0){
			System.out.println("The value of theNumber is "+ theNumber);
		}else
		if(theNumber == 1){
			System.out.println("The value of theNumber is "+ theNumber);
		}else
		if(theNumber == 2){
			System.out.println("The value of theNumber is "+ theNumber);
		}else
		if(theNumber == 3){
			System.out.println("The value of theNumber is "+ theNumber);
		}else
		if(theNumber == 4){
			System.out.println("The value of theNumber is "+ theNumber);
		}else
		if(theNumber == 5){
			System.out.println("The value of theNumber is "+ theNumber);
		}else
		if(theNumber == 6){
			System.out.println("The value of theNumber is "+ theNumber);
		}else
		if(theNumber == 7){
			System.out.println("The value of theNumber is "+ theNumber);
		}else
		if(theNumber == 8){
			System.out.println("The value of theNumber is "+ theNumber);
		}else
		if(theNumber == 9){
			System.out.println("The value of theNumber is "+ theNumber);
		}

		// END TODO #1


		/* TODO #2: Write snippet code which will output certain string depending on the 'theNumber' variable value
		* using SWITCH statement
		* which will output "The value of theNumber is <random number>"
		* Print "The number is not a valid choice" if theNumber value is not in the range of 0...9
		*/
		int ran=10;
		switch (ran) {
			case 0: System.out.println("The value of theNumber is "+ theNumber);
			case 1: System.out.println("The value of theNumber is "+ theNumber);
			case 2: System.out.println("The value of theNumber is "+ theNumber);
			case 3: System.out.println("The value of theNumber is "+ theNumber);
			case 4: System.out.println("The value of theNumber is "+ theNumber);
			case 5: System.out.println("The value of theNumber is "+ theNumber);
			case 6: System.out.println("The value of theNumber is "+ theNumber);
			case 7: System.out.println("The value of theNumber is "+ theNumber);
			case 8: System.out.println("The value of theNumber is "+ theNumber);
			case 9: System.out.println("The value of theNumber is "+ theNumber);
			default:
				System.out.println("The number is not a valid choice");
				break;

		}


		// END TODO #2

	}
}
