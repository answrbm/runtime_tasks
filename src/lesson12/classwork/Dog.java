package lesson12.classwork;

public class Dog {

    private String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Ошейник надет");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Собираемся на прогулку");
        if(isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Ура идем гулять " + name + " очень рад");
        } else {
            throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке! Проверьте экипировку");
        }
    }
}
