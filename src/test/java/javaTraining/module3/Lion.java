package javaTraining.module3;

final class Lion extends Animal{
    String name = "Lion";
    int age = 10;
    int size = 3;
    String color = "Brown";


    Lion(String name, int age, int size, String color) {
        super(name, age, size, color);
        this.name = name;
        this.age = age;
        this.size = size;
        this.color = color;
    }


    Lion(){

    }

    //Method Overriding
    public void information(){
        System.out.println("Name: " + this);
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }

    public void wash(){
        System.out.println(name +" Wash wash wash");
    }

}
