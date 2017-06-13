package javaTraining.module2;


/**
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

class Animal {
    private String name;
    private int age;
    private int size;
    private String color;

    //Animal constructor
    Animal(String name, int age, int size, String color){
        this.name = name;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    Animal(){
        name = "Tobi";
        age = 5;
        size = 3;
        color ="brown";
    }




    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }

    void setSize(int size){
        this.size = size;
    }
    int getSize(){
        return size;
    }

    void setColor(String color){this.color=color;}
    String getColor(){return color;}





    //Animal eating
    void eating(){
        System.out.println(name+" Nyam nyam nyam");
    }

    //Animal sleeping
    void sleeping(){
        System.out.println(name+" ZzzzZZzzzzzZzZzZZzzzZzZ");
    }

    //Animal make a noise
    void making_a_noise(){
        System.out.println(name+" BAM BAM CRASH SPLASH");
    }

    //Information about animal
    void information(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Size: "+size);
        System.out.println("Color: "+color);
    }

}
