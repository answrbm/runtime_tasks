package lesson14.hometask.hashmap;

public class Test {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Contact c1 = new Contact("Adam","+123456");
        Contact c2 = new Contact("Mark","+1234567");
        Contact c3 = new Contact("Sam","+1234568");
        Contact c4 = new Contact("Jeniffer","+1234569");

        phoneBook.addGroup("Friends");
        phoneBook.addGroup("Colleagues");
        phoneBook.addGroup("Family");

        phoneBook.addContact("Friends",c1);
        phoneBook.addContact("Colleagues",c1);

        phoneBook.addContact("Colleagues",c2);

        phoneBook.addContact("Friends",c3);

        phoneBook.addContact("Family",c4);

        phoneBook.getContactsByGroup("Friends");
    }
}
