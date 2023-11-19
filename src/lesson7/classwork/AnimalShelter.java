package lesson7.classwork;

import java.util.Random;

public class AnimalShelter {

    private Animal[] animals;

    public AnimalShelter(Animal[] animals) {
        this.animals = animals;
    }

    public void makeAllSounds() {
        Random random = new Random();
        for(Animal animal : animals) {
            int result = random.nextInt(2) + 1;
            if (result == 1) animal.makeSound();
            else animal.sleep();
        }
    }
}
