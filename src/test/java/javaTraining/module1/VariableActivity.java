package javaTraining.module1;

public class VariableActivity {

	/* TODO #1 Declare :
		1. Instance variables with primitive and object variables
		2. Class variables with primitive and object variables
		3. Local variables with primitive and object variables
	*/


	//Instance
    public int a1=1;


	//Class
    public static int a2=2;

	//Local
    public void getVariable3(int a3){
        System.out.println(a3);
    }
	// END TODO #1


	// TODO #2: initialize previously declared instance variable with some value in one method and output it in other method
	// Is it possible to have access to local variable from multiple methods?

    public static void main(String[] args){
        VariableActivity va = new VariableActivity();
        System.out.println(va.a1);

        System.out.println(a2);

        va.getVariable3(3);
    }


	// END TODO #2
}
