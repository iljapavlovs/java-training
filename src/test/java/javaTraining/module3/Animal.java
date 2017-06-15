package javaTraining.module3;



class Animal {
    private int age;
    private int size;
    private String color;
    public static final int CONST = 10;

    //Animal constructor
    Animal(int age, int size, String color){
        this.age = age;
        this.size = size;
        this.color = color;
    }



    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }


    //Animal eating
    public void eating(){
        System.out.println("Nyam nyam nyam");
    }

    //Animal sleeping
    public void sleeping(){
        System.out.println("ZzzzZZzzzzzZzZzZZzzzZzZ");
    }

    //Animal make a noise
    public void makingANoise(){
        System.out.println("BAM BAM CRASH SPLASH");
    }

    //Final method Animal Run
    public final void animalRun(){
        System.out.println("RUN RUN run run RUN");
    }


    //Information about animal
    public void information(){
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }
}




final class Lion extends Animal{
    final String name;
    int age;
    int size;
    String color;


    Lion(String name, int age, int size, String color) {
        super(age, size, color);
        this.name = name;
        this.age = age;
        this.size = size;
        this.color = color;
    }


    //Method Overriding
    public void information(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }

}





class Elephant extends Animal{
    String name;
    int age;
    int size;
    String color;


    Elephant(String name, int age, int size, String color) {
        super(age, size, color);
        this.name = name;
        this.age = age;
        this.size = size;
        this.color = color;
    }


    //Method Overriding
    public void information(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }

}
