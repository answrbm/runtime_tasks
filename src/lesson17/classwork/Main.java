package lesson17.classwork;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Введите дату: 2024 07 05
        //Это дата в прошлом
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите дату:");
//        String date = scanner.nextLine();
//        String[] dateParts = date.split(" ");
//        LocalDate localDate = LocalDate
//                .of(Integer.parseInt(dateParts[0]),Integer.parseInt(dateParts[1]),Integer.parseInt(dateParts[2]));
//        if(localDate.isAfter(LocalDate.now()))
//            System.out.println("Это дата в будущем");
//        if(localDate.isBefore(LocalDate.now()))
//            System.out.println("Это дата в прошлом");
//        if(localDate.isEqual(LocalDate.now()))
//            System.out.println("Это дата в настоящем");


        //1 смена. Начало: 2025-06-01T08:30, конец: 2025-06-01T13:30
//
//        System.out.println("Расписание смен:");
//        LocalDateTime start = LocalDateTime.of(2025,6,1,8,30);
//        for(int i = 0; i < 5; i++) {
//            System.out.print((i+1) + " смена.");
//            System.out.print(" Начало: " + start);
//            LocalDateTime end = start.plusHours(5);
//            System.out.println(", конец: " + end);
//            start = end;
//        }

//        // Дата выхода первой серий
//        LocalDate first = LocalDate.of(2011, 4, 17);
//        // Дата выхода последней серий - 2019 году 20 мая
//        LocalDate last = LocalDate.of(2019,5,20);
//
//        // Вывести сколько времени длилось данный сериал
//        Period period = Period.between(first,last);
//        System.out.println(period.getYears() + " лет " + period.getMonths() + " месяц " + period.getDays() + " дня.");
//        System.out.println("Общее количество дней: " + ChronoUnit.DAYS.between(first,last));


//        String input = "14 часов 09 минут. Месяц: 02, День: 14, Год: 1966.";
//        // 14_02_1966|14:09
//
//        DateTimeFormatter inputTimeFormatter = DateTimeFormatter.ofPattern("HH часов mm минут. Месяц: MM, День: dd, Год: yyyy.");
//        LocalDateTime inputDate = LocalDateTime.parse(input,inputTimeFormatter);
//        System.out.println(inputDate);
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd_MM_yyyy|HH:mm");
//        System.out.println(inputDate.format(timeFormatter));

//        // время начала работы над задачей — 9:00
//        LocalTime taskStart = LocalTime.of(9,0);
//        // время окончания работы над задачей — 11:30
//        LocalTime taskFinish = LocalTime.of(11,30);
//
//        // опишите формат вывода в виде часы:минуты
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
//
//        // найдите продолжительность между двумя единицами времени
//        Duration duration = Duration.between(taskStart,taskFinish);
//
//        // taskStart должен быть выведен в указанном формате
//        System.out.println("В прошлый раз задача была начата в " + taskStart.format(formatter) + ",");
//        // taskFinish должен быть выведен в указанном формате
//        System.out.println("а закончена в " + taskFinish.format(formatter) + ".");
//
//        LocalTime now = LocalTime.now();
//        // now должен быть выведен в указанном формате
//        System.out.println("Сейчас " + now.format(formatter) + ".");
//
//        // прибавьте к текущему моменту вычисленную продолжительность
//        LocalTime finishTime = now.plus(duration);
//
//        // finishTime должен быть выведен в указанном формате
//        System.out.println("Значит, задача будет выполнена к " + finishTime.format(formatter) + ".");

        //Сгенерировать случайную дату 21 века
        // 2001 01 01 до 2100 12 31

        int year = new Random().nextInt(2001,2101);
        int month = new Random().nextInt(1,13);
        int day = new Random().nextInt(1,32);
        if(month == 2) {
            if(day > 29)
                day = 29;
        }
        if(month == 4 || month == 6 || month == 9 || month == 11) {
            if(day > 30)
                day = 30;
        }
        System.out.println(LocalDate.of(year,month,day));
    }

}
