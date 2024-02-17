package lesson14.classwork;

public class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = id;
        result += name.hashCode() * 31;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || !o.getClass().equals(getClass()))
            return false;

        Person p = (Person)o;
        if(id != p.getId())
            return false;

        return name.equals(p.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
