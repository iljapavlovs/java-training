package javaTraining.module1;

public class OperatorActivity {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z;

        //TODO - assign the sum of x and y to z variable

        z = x+y;
        System.out.println("X and Y summ "+z);

        //TODO - write z=z+1 in a shorter way (2 ways possible)
        z++;
        System.out.println(z);
        ++z;
        System.out.println(z);

        //TODO - Increment x by 1 and the assign it to z
        z=x++;
        System.out.println(z);
        //TODO - Assign x variable to z variable and the increment x by 1. NOTE - should be done as one expression
        z=x++;
        System.out.println(z);
        //TODO - show example of RELATIONAL operator

        if(z==2){
            System.out.println("ir vienads");
        }else{
            System.out.println("nav vienads");
        }

        //TODO - show example of LOGICAL operator

        if(z ==1 && x==2){
            System.out.println("nav vienadi");
        }

        //TODO - show example of ()? ():() operator


    }
}
