package javaTraining.module1;

import java.util.Random;

public class ArrayDeclarationActivity {

	public static void main(String[] args) {

		// TODO #1: Declare array of integers and Strings (without initializiation)
		int[] mas1;
		String[] mas2;
		// END TODO #1

		// TODO #2: Initialize/assign previously declared arrays with size of 10
		mas1 =new int[10];
		mas2 =new String[10];

		// END TODO #2
		// TODO #3: assign any String for 1st array element
		mas2[1] = "eeeee";
		System.out.println(mas2[1]);
		// END TODO #3
		// TODO #4: declare, initiliaze and assign 5 elements to an array in another way in one line (with curly braces)
		// both - String and integer arrays
		for(int i=1 ; i<=5;i++){mas1[i]= new Random().nextInt(10);
			System.out.println(mas1[i]);}

		// END TODO #4
		// TODO #5: access 3rd element from integer array and output it
		System.out.println(mas1[3]);
		// END TODO #5


		// TODO #6: access 1st element from String array
		System.out.println(mas2[1]);
		// END TODO #6
	}
}
