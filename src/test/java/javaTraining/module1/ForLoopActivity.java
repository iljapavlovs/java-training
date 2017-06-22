package javaTraining.module1;

public class ForLoopActivity {
	
	public static void main(String[] args) {

		// TODO #1: print numbers from 1 to 10 by using FOR loop
		for (int i=1  ;i<=10; i++){
			System.out.println(i);
		}

		// END TODO #1


		/* TODO #2: Print 5 by 10 grid. It should look like something like this in the console:
				* * * * * * * * * *
				* * * * * * * * * *
				* * * * * * * * * *
				* * * * * * * * * *
				* * * * * * * * * *
		     Hint - use nested FOR loop
		     */
		for (int i = 1; i<=5; i++){
			for (int a=1  ;a<=10; a++){
				System.out.print(a+" ");
			}
			System.out.println();
		}
		// END TODO #2
	}
}
