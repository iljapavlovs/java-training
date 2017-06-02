package javaTraining.module1;

public class CastingActivity {

    public static void main(String arg[]) {

		/* TODO #1: Declare and initialize following primitive variables with some values
		byte
		short
		int
		double
		*/
		short sh = 100;
        double dub = 2.0;
        int in = 5;
        byte buy = 23;
        // END TODO #1


        // TODO #2: Write a code which will show example of Implicit Casting for previously declared variables
        in=in*5;
        System.out.println(in);

        // END TODO #2


        // TODO #3: Write a code which will show example of Explicit Casting for previously declared variables
        dub = dub + 5;
        System.out.println(dub);

        // END TODO #3
    }
}
