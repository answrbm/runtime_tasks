package lesson14.classwork;

import java.util.*;

public class Test {

    public static void main(String[] args) {
//        List<String> fruits = Arrays.asList("Apple","Orange","Banana");
//
//        for(int i = 0; i < fruits.size(); i++) {
//            String fruit = fruits.get(i);
//            System.out.println("Fruit: " + fruit);
//        }
//
//        for(String fruit : fruits) {
//            System.out.println("Fruit: " + fruit);
//        }
//
//        for(Iterator<String> it = fruits.iterator(); it.hasNext(); ) {
//            String fruit = it.next();
//            System.out.println("Fruit: " + fruit);
//        }
//
//        Iterator<String> it = fruits.iterator();
//        while(it.hasNext()) {
//            String fruit = it.next();
//            System.out.println("Fruit: " + fruit);
//        }

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(12);
//        numbers.add(8);
//        numbers.add(2);
//        numbers.add(23);
//        Iterator<Integer> it = numbers.iterator();
//
//        while (it.hasNext()) {
//           Integer i = it.next();
//           if(i < 10) {
//               it.remove();
//           }
//        }
//        System.out.println(numbers);
//
//        Iterator<Integer> iterator = numbers.iterator();
//        while(iterator.hasNext()) {
//            Integer num = iterator.next();
//            numbers.remove(num);
//        }

//        Map<String, Integer> womenInfoMap = new HashMap<>();
//        Map<String, Integer> userInfoMap = new HashMap<>();
//
//        userInfoMap.put("Adam",28);
//        userInfoMap.put("Mark",18);
//        userInfoMap.put("Sam",21);
//
//        womenInfoMap.put("Liza",35);
//        womenInfoMap.put("Rachel",30);
//        womenInfoMap.put("Monika",25);
//
//        userInfoMap.putAll(womenInfoMap);
//
//        System.out.println(userInfoMap.get("Liza"));
//        System.out.println(userInfoMap.get("Sam"));
//
//        userInfoMap.remove("Adam");
//
//        System.out.println(userInfoMap.get("Adam"));
//
//        System.out.println(userInfoMap.containsKey("Adam"));
//        System.out.println(userInfoMap.containsValue(30));

//        HashMap<Person, String> peopleMap = new HashMap<>();
//        Person person1 = new Person(1,"Adam");
//        Person person2 = new Person(2,"Mark");
//        Person person3 = new Person(3,"Sam");
//        Person person4 = new Person(1,"Adam");
//
//        peopleMap.put(person1,"QA");
//        peopleMap.put(person2,"Dev");
//        peopleMap.put(person3,"BA");
//        peopleMap.put(person4,"QA");
//
//        System.out.println(peopleMap);

        Map<String,Integer> mathGrades = new HashMap<>();
        Map<String,Integer> physicsGrades = new HashMap<>();
        Map<String,Integer> geographyGrades = new HashMap<>();

        Map<String,Map<String,Integer>> studentsGrades = new HashMap<>();

        mathGrades.put("30 january",90);
        mathGrades.put("29 january",80);

        geographyGrades.put("31 june",90);
        geographyGrades.put("29 june",80);

        physicsGrades.put("11 february",50);
        physicsGrades.put("12 february",40);

        studentsGrades.put("Smith",mathGrades);
        studentsGrades.put("Johnson",geographyGrades);
        studentsGrades.put("Dirk",physicsGrades);


        int groupAverageGrade;
        int groupSum = 0;
        int gradesSize = 0;
        for(String student : studentsGrades.keySet()) {
            int averageGrade;
            int sum = 0;
            Collection<Integer> grades = studentsGrades.get(student).values();
            gradesSize += grades.size();
            for(int grade : grades) {
                sum += grade;
            }
            groupSum += sum;
            averageGrade = sum/grades.size();
            System.out.println(student + " average grade: " + averageGrade);
        }
        System.out.println("Group average grade: " + groupSum/gradesSize);
    }
}
