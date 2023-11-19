package lesson7.classwork;

public class Test {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(),new Cat(),new Bird()};
        AnimalShelter animalShelter = new AnimalShelter(animals);
        animalShelter.makeAllSounds();
    }
}
