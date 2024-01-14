package lesson11.classwork;

public class Person {
    private String name;
    private int dnaCode;

    public Person(String name, int dnaCode) {
        this.name = name;
        this.dnaCode = dnaCode;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(this.getClass() != o.getClass()) return false;

        Person p = (Person) o;
        if(!name.equals(p.name)) return false;
        return dnaCode == p.dnaCode;
    }
}
