package javaTraining.module3;

class Zoo{
    String name;
    private Animal animal;
    private Lion lion;
    private Elephant elephant;
    public Zoo(){
        this.animal = new Animal();
        this.lion = new Lion();
        this.elephant = new Elephant();
    }

    public void prepareAnimal(String name){
        System.out.print(name);
        animal.wash();
    }
}
