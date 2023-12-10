package lesson6;

public class Person {
    private String name;
    private int age;
    private int weight;

    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("Александр") || name.equals("Майк")) {
            System.out.println("Выберите другое имя!");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18) {
            System.out.println("Человек должен быть совершеннолетний!");
        } else {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 100) {
            System.out.println("Человек должен весить не больше 100 кг!");
        } else {
            this.weight = weight;
        }
    }
}
