package lesson9.hometask;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        //Task 1
//        String text = "application hello template";
//        String word = "hello";
//
//        System.out.println("Does contain 1: " + text.contains(word));
//        System.out.println("Does contain 2: " + text.indexOf(word));

        //Task 2
//        String[] names = {"Alex","Drake","Anya","Leon","Adam"};
//
//        Arrays.stream(names).filter(name -> name.startsWith("A")).forEach(System.out::println);
//        Arrays.stream(names).filter(name -> name.indexOf("A") == 0).forEach(System.out::println);
//        Arrays.stream(names).filter(name -> name.charAt(0) == 'A').forEach(System.out::println);

        //Task 3
//        String text = "application hello transaction template";

//        int firstSpaceIndex = text.indexOf(" ");
//        String firstWord = text.substring(0,firstSpaceIndex);
//        System.out.println("First word: " + firstWord);
//
//        int lastSpaceIndex = text.lastIndexOf(" ");
//        String lastWord = text.substring(lastSpaceIndex+1);
//        System.out.println("Last word: " + lastWord);

//        for(int i = 0; i < text.length(); i++) {
//            if(text.charAt(i) != ' ')
//                System.out.print(text.charAt(i));
//            else
//                break;
//        }
//
//        StringBuilder word = new StringBuilder();
//        for(int i = text.length()-1; i >= 0; i--) {
//            if(text.charAt(i) != ' ')
//                word.append(text.charAt(i));
//            else
//                break;
//        }
//        System.out.println(" " + word.reverse());

        //Task 4
//        String text = "application hello template";
//        String word = "hello";
//
//        int count = 0;
//        for(int i = 0; i < text.length(); i++) {
//            if(text.indexOf(word,i) != -1) {
//                count++;
//                i = text.indexOf(word,i);
//            }
//        }
//        System.out.println("Count of " + word + ": " + count);

        //Task 5
        String text = "application hello template hello translate";
        String word = "hello";

        text = text.replace(word,"*".repeat(word.length()));
        System.out.println(text);

    }
}
