package lesson14.hometask.hashmap;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result += (phoneNumber != null ? phoneNumber.hashCode() : 0) * 31;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;

        if(o == null || !getClass().equals(o.getClass()))
            return false;

        Contact c = (Contact) o;
        if(!name.equals(c.name)) return false;

        return phoneNumber.equals(c.phoneNumber);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
