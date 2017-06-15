package javaTraining.module3;


public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion();
        Elephant elephant= new Elephant();
        Zoo zoo = new Zoo();

        System.out.println("Lion:");
        lion.information();
        lion.eating();
        lion.sleeping();
        lion.makingANoise();
        lion.animalRun();
        System.out.println();



        System.out.println("Elephant:");
        elephant.information();
        elephant.sleeping();
        elephant.eating();
        elephant.makingANoise();
        elephant.animalRun();
        System.out.println();


    }
}
