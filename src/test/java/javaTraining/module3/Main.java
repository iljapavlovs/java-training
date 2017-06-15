package javaTraining.module3;


public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion("Lion",3, 2, "White");
        Elephant elephant= new Elephant("Elephant",10, 5, "Gray");

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
