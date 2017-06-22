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
        Animal animal = new Animal("Nami", 3, 2, "White");
        Animal animal2 = new Animal();

        System.out.println("First animal:");
        animal.information();
        animal.eating();
        animal.sleeping();
        animal.makingANoise();
        animal.makingANoise(2);


        System.out.println("Second animal:");
        animal2.information();
        animal2.eating();
        animal2.sleeping();
        animal2.makingANoise();
        animal2.makingANoise(3);


    }
}
