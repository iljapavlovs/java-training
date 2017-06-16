package javaTraining.module3;

class Elephant extends Animal{
    String name = "Elephant";
    int age = 50;
    int size = 10;
    String color = "Gray";

    Elephant(String name, int age, int size, String color) {
        super(name, age, size, color);
        this.name = name;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    Elephant(){

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
