package lesson17.hometask;

import java.time.LocalDate;

public class Friend {

    private String name;
    private LocalDate birthDate;

    public Friend(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
