package org.okamihu;

public class Dog {

    String DogName;
    int age;
    String breed;
    String color;
    String barkSound;
    Boolean isTrained;

    public void printDogName() {
        System.out.println("Name: " + DogName);
    }

    public void sound() {
        System.out.println("Sound: " + barkSound);
    }

    public void printDogInfo() {
        System.out.println("Informace o psu: " + DogName);
        System.out.println("Name: " + DogName);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        if (isTrained == null) {
            System.out.println("Trained: neznámo");
        } else {
            System.out.println("Trained: " + (isTrained ? "is trained" : "not trained"));
        }
    }

    public void validateDog() {
        StringBuilder missing = new StringBuilder();

        if (DogName == null || DogName.isBlank()) missing.append("DogName, ");
        if (breed == null || breed.isBlank()) missing.append("breed, ");
        if (color == null || color.isBlank()) missing.append("color, ");
        if (age <= 0) missing.append("age, ");
        if (isTrained == null) missing.append("stav tréninku  "); //proc prosim musim udelat zde dve mezery za 'tréninku' aby mi to v konzoli vypsalo cele slovo treninku?
        if (missing.length() > 0) {
            String missingFields = missing.substring(0, missing.length() - 2);
            throw new IllegalStateException("Chyba: nejsou dodány tyto informace: " + missingFields);
        }
    }

    public void generateBarkSound() {
        if (breed.equalsIgnoreCase("Rotvajler")) {
            barkSound = "Bark Bark!";
        } else if (breed.equalsIgnoreCase("Shiba")) {
            barkSound = "Haf Haf!";
        } else {
            barkSound = "Woof!";

        }
    }
}

