package javaTraining.module3;

/*
### Создайте более специализированные классы Animal - Lion and Elephant (** Наследование, отношения IS-A, Order of Calling Constructors, ключевое слово Super) **)
1. Переопределить поведение и поля из класса Super (** Переопределение метода **)
     1. Можно ли переопределить переменные экземпляра?
2. Предоставляйте интерфейсы для написания полей чтения и чтения.
3. Инициализируйте объекты Lion и Elephant и установите все переменные экземпляра.
4. Вызвать все виды поведения
*/

class Animal {
    protected int age;
    protected int size;
    protected String color;

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


    //Information about animal
    public void information(){
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }
}




class Lion extends Animal{
    String name;
    Lion(String name, int age, int size, String color) {
        super(age, size, color);
        this.name = name;
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
    Elephant(String name, int age, int size, String color) {
        super(age, size, color);
        this.name = name;
    }
    //Method Overriding
    public void information(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }

}
