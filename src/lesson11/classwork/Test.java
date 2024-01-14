package lesson11.classwork;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Adam",12345);
        Person p2 = new Person("Adam",12345);
        System.out.println(p1.equals(p2));

        LuxuryAuto auto1 = new LuxuryAuto("Mercedes",2022,70000);
        LuxuryAuto auto2 = new LuxuryAuto("Mercedes",2022,70000);
        System.out.println(auto1.hashCode());
        System.out.println(auto2.hashCode());
        System.out.println(auto1.hashCode() == auto2.hashCode());
    }
}
