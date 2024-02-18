package lesson14.hometask.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
        String input;
        while(!(input = scanner.nextLine()).equals("end")) {
            Student student = studentMapper(input);
            if(!students.add(student)) {
                System.out.println("Уже есть такой студент");
            }
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
        }

        System.out.println(students);
    }

    private static Student studentMapper(String studentString) {
        String[] studentData = studentString.split(",");
        String name = studentData[0].trim();
        String group = studentData[1].trim();
        String studentId = studentData[2].trim();

        return new Student(studentId,name,group);
    }
}
