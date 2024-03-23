package lesson21.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Test {

    public static void main(String[] args) {

        //Custom functional interface
//        Capitalizer capitalizer = word -> word.replaceFirst(String.valueOf(word.charAt(0)),
//                String.valueOf(word.charAt(0)).toUpperCase());
//        String newWord = capitalizer.capitalize("adam");
//        System.out.println(newWord);

        //UnaryOperator
        //[1,2,3,4,5]
        //[2,4,6,8,10]
//        UnaryOperator<List<Integer>> unaryOperator = numbers -> {
//            List<Integer> multNums = new ArrayList<>();
//            numbers.forEach(number -> multNums.add(number*2));
//            return multNums;
//        };
//        List<Integer> multNums = unaryOperator.apply(List.of(1,2,3,4,5));
//        System.out.println(multNums);

        //StreamAPI
        List<String> languages = List.of("java","javascript","rust","assembler");

        //Оставить только те строки у которых минимум 5 символов
        //Преобразовать все в capitalize
        languages.stream()
                .filter(s -> s.length() >= 5)
                .map(s -> s.replaceFirst(String.valueOf(s.charAt(0)),String.valueOf(s.charAt(0)).toUpperCase()))
                .forEach(System.out::println);
    }
}
