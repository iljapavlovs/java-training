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
        Animal animal2;
        animal = new Animal("Nami", 3, 2, "White");
        animal2 = new Animal("Tobi", 5, 3, "Brown");

        System.out.println("first pet - 1, second pet - 2;");
        int l = reader.nextInt();
        if (l<1 || l>2) {
            do {
                System.out.println("It is not valid value! Please repeat:");
                l = reader.nextInt();
            } while (l < 1 || l > 2);
        }

        System.out.println();
        //Home Menu
        System.out.println("        Menu        ");
        System.out.println("Your pet can eat - 1");
        System.out.println("Your pet can sleep - 2");
        System.out.println("Your pet can make a noise - 3");
        System.out.println("Information about your pet - 4");
        System.out.println("Change information about your pet - 5");
        System.out.println("Change pet - 6");
        System.out.println("Out - 0");


        int i = reader.nextInt();
        do{
            if (l==1) {
                if (i == 1) {
                    animal.eating();
                }
                if (i == 2) {
                    animal.sleeping();
                }
                if (i == 3) {
                    animal.making_a_noise();

                }
                if (i == 4) {
                    animal.information();
                }

                if (i == 5) {
                    int z;
                    //Animal change parameters menu
                    System.out.println("Change pet name - 1");
                    System.out.println("Change pet age - 2");
                    System.out.println("Change pet size - 3");
                    System.out.println("Change pet color - 4");
                    System.out.println("Out - 0");

                    do {
                        z = reader.nextInt();
                        if (z == 1) {
                            System.out.println("Please enter new pet name:");   //name change
                            animal.name = reader.next();
                            System.out.println("Changes is saved!");
                        }
                        if (z == 2) {
                            System.out.println("Please enter new pet age:");    //age change
                            animal.age = reader.nextInt();
                            System.out.println("Changes is saved!");
                        }
                        if (z == 3) {
                            System.out.println("Please enter new pet size:");   //size change
                            animal.size = reader.nextInt();
                            System.out.println("Changes is saved!");
                        }
                        if (z == 4) {
                            System.out.println("Please enter new pet color:");  //color change
                            animal.color = reader.next();
                            System.out.println("Changes is saved!");
                        }
                        //Error message
                        if (z <= 0 && z > 4) {
                            System.out.println("It is not valid value");
                        }
                        //repeat pet changes menu
                        if (z != 0) {
                            System.out.println("Change pet name - 1");
                            System.out.println("Change pet age - 2");
                            System.out.println("Change pet size - 3");
                            System.out.println("Change pet color - 4");
                            System.out.println("Out - 0");
                        }
                    } while (z != 0);
                }
            }

            if (l==2) {
                if (i == 1) {
                    animal2.eating();
                }
                if (i == 2) {
                    animal2.sleeping();
                }
                if (i == 3) {
                    animal2.making_a_noise();

                }
                if (i == 4) {
                    animal2.information();
                }
                if (i == 5) {
                    int z;
                    //Animal change parameters menu
                    System.out.println("Change pet name - 1");
                    System.out.println("Change pet age - 2");
                    System.out.println("Change pet size - 3");
                    System.out.println("Change pet color - 4");
                    System.out.println("Out - 0");

                    do {
                        z = reader.nextInt();
                        if (z == 1) {
                            System.out.println("Please enter new pet name:");   //name change
                            animal2.name = reader.next();
                            System.out.println("Changes is saved!");
                        }
                        if (z == 2) {
                            System.out.println("Please enter new pet age:");    //age change
                            animal2.age = reader.nextInt();
                            System.out.println("Changes is saved!");
                        }
                        if (z == 3) {
                            System.out.println("Please enter new pet size:");   //size change
                            animal2.size = reader.nextInt();
                            System.out.println("Changes is saved!");
                        }
                        if (z == 4) {
                            System.out.println("Please enter new pet color:");  //color change
                            animal2.color = reader.next();
                            System.out.println("Changes is saved!");
                        }
                        //Error message
                        if (z <= 0 && z > 4) {
                            System.out.println("It is not valid value");
                        }
                        //repeat pet changes menu
                        if (z != 0) {
                            System.out.println("Change pet name - 1");
                            System.out.println("Change pet age - 2");
                            System.out.println("Change pet size - 3");
                            System.out.println("Change pet color - 4");
                            System.out.println("Out - 0");
                        }
                    } while (z != 0);
                }
            }


            if (i==6){
                System.out.println("first pet - 1, second pet - 2;");
                l = reader.nextInt();
                if (l<1 || l>2) {
                    do {
                        System.out.println("It is not valid value! Please repeat:");
                        l = reader.nextInt();
                    } while (l < 1 || l > 2);
                }
            }



            //Error message
            if (i < 0 && i > 5) {
                System.out.println("It is not valid value");
            }
            //repeat home menu
            System.out.println();
            System.out.println("        Menu        ");
            System.out.println("Your pet can eat - 1");
            System.out.println("Your pet can sleep - 2");
            System.out.println("Your pet can make a noise - 3");
            System.out.println("Information about your pet - 4");
            System.out.println("Change information about your pet - 5");
            System.out.println("Change pet - 6");
            System.out.println("Out - 0");
            i = reader.nextInt();
        }while (i!=0);
        //end
        System.out.println("Thank you!");
    }


}
