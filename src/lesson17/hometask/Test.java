package lesson17.hometask;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        List<Friend> friends = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while(option != 0) {
            System.out.println("1. Добавить друга");
            System.out.println("2. Узнать сколько дней осталось до дня рождения друга");
            System.out.println("3. Вывод всех друзей");
            System.out.println("0. Выйти");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Имя друга:");
                    String name = scanner.next();
                    scanner.nextLine();
                    System.out.println("Введите дату(год месяц день):");
                    String birthDate = scanner.nextLine();
                    Friend friend = new Friend(name, parseDate(birthDate));
                    friends.add(friend);
                }
                case 2 -> {
                    System.out.print("Имя друга:");
                    String name = scanner.next();
                    Friend foundFriend = friends.stream()
                            .filter(friend -> friend.getName().equals(name)).findAny().orElse(null);
                    birthDateDateCalc(foundFriend.getBirthDate());
                }
                case 3 -> {
                    friends.forEach(System.out::println);
                }
            }
        }
    }

    private static LocalDate parseDate(String inputDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        return LocalDate.parse(inputDate,formatter);
    }

    private static void birthDateDateCalc(LocalDate birthDate) {
        int currentYear = LocalDate.now().getYear();
        long days = ChronoUnit.DAYS.between(LocalDate.now(),birthDate.withYear(currentYear));
        long years = ChronoUnit.YEARS.between(birthDate,LocalDate.now());
        if(days < 0) {
            days = ChronoUnit.DAYS.between(LocalDate.now(),birthDate.withYear(currentYear+1));
        }
        System.out.println("Осталось " + days + ". Исполнится " + (years+1) + " лет");
    }
}
