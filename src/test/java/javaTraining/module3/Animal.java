package javaTraining.module3;



class Animal {
    private String name;
    private int age;
    private int size;
    private String color;
    public static final int CONST = 10;

    //Animal constructor
    Animal(String name,  int age, int size, String color){
        this.age = age;
        this.size = size;
        this.color = color;
    }

    Animal(){

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
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

    public void wash(){
        System.out.println("Wash wash wash");
    }
}


class Zoo{

    private Animal animal;
    private Lion lion;
    private Elephant elephant;
    public Zoo(){
        this.animal = new Animal();
        this.lion = new Lion();
        this.elephant = new Elephant();
    }

    public void prepareAnimal(){

    }
}



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
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }

    public void wash(){
        System.out.println(name +" Wash wash wash");
    }

}






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
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }

    public void wash(){
        System.out.println(name +" Wash wash wash");
    }

}
