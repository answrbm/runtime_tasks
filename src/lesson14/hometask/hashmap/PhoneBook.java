package lesson14.hometask.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private final Map<String, List<Contact>> groups;

    public PhoneBook() {
        this.groups = new HashMap<>();
    }

    public void addContact(String group, Contact contactToAdd) {
        List<Contact> groupContacts = groups.get(group);
        groupContacts.add(contactToAdd);
    }

    public void getContactsByGroup(String group) {
        groups.get(group).forEach(System.out::println);
    }

    public void addGroup(String group) {
        groups.put(group,new ArrayList<>());
    }
}
