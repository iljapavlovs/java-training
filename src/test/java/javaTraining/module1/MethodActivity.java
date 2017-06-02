package javaTraining.module1;

public class MethodActivity {

	// TODO #1: write a method which will output "Hello!"

	public static void pub(){
		System.out.println("Hello!");
	}

	// END TODO #1

	// TODO #2: write a static method which will output "Hello!"
	public static void pub2(){
		System.out.println("Hello");
	}

	// END TODO #2

	// TODO #3: Write method which returns a sum of 2 numbers. 2 numbers should be passed as parameters.

	public static int pub3(int a, int b){
		int sum;
		sum = a+b;
		return sum;
	}
	// END TODO #3

	
	public static void main(String arg[]){

		// TODO #4: Invoke a method from TODO #1. HINT - main() method is a STATIC method
		pub();

		// END TODO #4


		// TODO #5: Invoke a method from TODO #2. (Try to invoke it 2 ways possible)
		pub2();

		// END TODO #5


		// TODO #6: Invoke a method from 3rd 'TODO'. Assign return value of this method to a variable and output it
		int a =2;
		int b =5;
		int pub4 = pub3(a, b);
		System.out.println(pub4);
		// END TODO #6
	}
}
