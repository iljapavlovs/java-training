package javaTraining.module2;
import java.util.Scanner;


/*
### Create an Animal class. Animal class should have
1. 3 fields - age, size, color (don`t use public access level, nor default) - **Access Level, Instance Variables**
2. Provide interfaces for writing and reading Animal`s class fields. Name of the parameters should be the same as the fields (**Methods, Encapsulation, Getters/Setters**)
3. 3 behaviours - eating, sleeping, making a noise. All 3 should just output corresponding behaviour to console.(**Methods**)
4. Create another behaviour with the same behaviour name as when making a noise, but this time you should set what the output should be. (**Overloading, Method Parameters**)
5. 2 ways of constructing the Animal class - by setting only the age and setting all 3 fields at once. (**Constructors**)
6. Create 2 animal objects constructing those with different constructors. This should be done from a separate file. (**Main Method**)
7. Set all missing fields for the objects
8. Invoke all behaviours

*/


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Animal animal;
        animal = new Animal();

        System.out.println("Basic information about your pet!");
        System.out.println("Please enter your pet name: ");
        animal.name = reader.next();
        System.out.println("Please enter your pet age: ");
        animal.age = reader.nextInt();
        System.out.println("Please enter your pet size: ");
        animal.size = reader.nextInt();
        System.out.println("Please enter your pet color: ");
        animal.color = reader.next();


        System.out.println();

        System.out.println("        Menu        ");
        System.out.println("Your pet can eat - 1");
        System.out.println("Your pet can sleep - 2");
        System.out.println("Your pet can make a noise - 3");
        System.out.println("Information about your pet - 4");
        System.out.println("Change information about your pet - 5");
        System.out.println("        Out - 0     ");


        int i = reader.nextInt();
        do{
            if (i==1){
                animal.eating();
            }
            if (i==2){
                animal.sleeping();
            }
            if (i==3){
                animal.making_a_noise();
            }
            if (i==4){
                animal.information();
            }
            if (i==5){
                int z;
                System.out.println("Change pet name - 1");
                System.out.println("Change pet age - 2");
                System.out.println("Change pet size - 3");
                System.out.println("Change pet color - 4");
                System.out.println("Out - 0");
                z = reader.nextInt();
                do {
                    if (z == 1) {
                        System.out.println("Please enter new pet name:");
                        animal.name = reader.next();
                        System.out.println("Changes is saved!");
                    }
                    if (z == 2) {
                        System.out.println("Please enter new pet age:");
                        animal.age = reader.nextInt();
                        System.out.println("Changes is saved!");
                    }
                    if (z == 3) {
                        System.out.println("Please enter new pet size:");
                        animal.size = reader.nextInt();
                        System.out.println("Changes is saved!");
                    }
                    if (z == 4) {
                        System.out.println("Please enter new pet color:");
                        animal.color = reader.next();
                        System.out.println("Changes is saved!");
                    }
                    if (z <= 0 && z > 4) {
                        System.out.println("It is not valid value");
                    }
                    System.out.println("Change pet name - 1");
                    System.out.println("Change pet age - 2");
                    System.out.println("Change pet size - 3");
                    System.out.println("Change pet color - 4");
                    System.out.println("Out - 0");
                    z = reader.nextInt();
                }while (z!=0);
            }

            if (i < 0 && i > 5) {
                System.out.println("It is not valid value");
            }

            System.out.println();
            System.out.println("        Menu        ");
            System.out.println("Your pet can eat - 1");
            System.out.println("Your pet can sleep - 2");
            System.out.println("Your pet can make a noise - 3");
            System.out.println("Information about your pet - 4");
            System.out.println("Change information about your pet - 5");
            System.out.println("        Out - 0     ");
            i = reader.nextInt();
        }while (i!=0);

        System.out.println("Thank you!");
    }


}
