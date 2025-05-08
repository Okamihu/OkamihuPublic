package org.okamihu;

public class Main01 {

    public static void main(String[] args) {
        System.out.println("\n\n");

        // Dog Ninjas

        Dog dog1 = new Dog();
        dog1.DogName = "Barkanello";
        dog1.age = 1;
        dog1.breed = "Rotvajler";
        dog1.color = "Black";
        dog1.isTrained = true;
        dog1.printDogInfo();
        dog1.generateBarkSound();
        dog1.sound();

        System.out.println();

        Dog dog2 = new Dog();
        dog2.DogName = "Hafaelo";
        dog2.age = 4;
        dog2.breed = "Shiba";
        dog2.color = "Yellow";
        dog2.isTrained = false;
        dog2.printDogInfo();
        dog2.generateBarkSound();
        dog2.sound();

        System.out.println();

        Dog dog3 = new Dog();

        try {
            dog3.validateDog();
            dog3.generateBarkSound();
            dog3.sound();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }




    }
}
