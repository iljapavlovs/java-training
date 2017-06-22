package javaTraining.module3;



class Animal extends Object{
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
        System.out.println(" Wash wash wash");
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}












