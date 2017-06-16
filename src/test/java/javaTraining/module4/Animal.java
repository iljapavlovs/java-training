package javaTraining.module4;

abstract class Animal{
    private String name;
    private int age;
    private int size;
    private String color;


    //Animal eating
    public void eating(){
        System.out.println(name + " Nyam nyam nyam");
    }

    //Animal sleeping
    public void sleeping(){
        System.out.println(name + " ZzzzZZzzzzzZzZzZZzzzZzZ");
    }

    //Animal make a noise
    public abstract void makingANoise();


    //Information about animal
    public void information(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println();
    }

}