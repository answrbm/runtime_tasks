package lesson9.hometask;

import java.util.Arrays;
import java.util.stream.Stream;

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
//        String text = "application hello template hello translate";
//        String word = "hello";
//
//        text = text.replace(word,"*".repeat(word.length()));
//        System.out.println(text);

        //MORE TASKS

        //Task 1
//        String text = "Java is a widely used programming language";
//        String[] words = text.split("\\s");
//        System.out.println(Arrays.toString(words));
//        StringBuilder sortedText = new StringBuilder();
//
//        for(int wordIndex = 0; wordIndex < words.length; wordIndex++) {
//            for(int i = wordIndex+1; i < words.length; i++) {
//                if(words[wordIndex].length() > words[i].length()) {
//                    String temp = words[wordIndex];
//                    words[wordIndex] = words[i];
//                    words[i] = temp;
//                } else if(words[wordIndex].length() == words[i].length()) {
//                    if(words[wordIndex].compareTo(words[i]) > 0) {
//                        String temp = words[wordIndex];
//                        words[wordIndex] = words[i];
//                        words[i] = temp;
//                    }
//                }
//            }
//            sortedText.append(words[wordIndex]);
//            if(wordIndex < words.length-1)
//                sortedText.append(" ");
//        }
//        System.out.println(sortedText);

        //Task 3
//        String text = "Java is as versatile as Java can be. JAVA is everywhere!";
//        String oldWord = "Java";
//        String newWord = "Python";
//
//        text = text
//                .replaceAll(oldWord,newWord)
//                .replaceAll(oldWord.toLowerCase(),newWord.toLowerCase())
//                .replaceAll(oldWord.toUpperCase(),newWord.toUpperCase());
//        System.out.println(text);

        //Task 4
//        String text = "Java is easy to learn, is easy to write, and is easy to debug";
        //Only one word
//        String[] words = text.split("\\s");
//        String mostFrequentWord = words[0];
//        int mostFrequentCounter = Integer.MIN_VALUE;
//        for(int wordIndex = 0; wordIndex < words.length; wordIndex++) {
//            int frequencyCounter = 1;
//            for(int i = wordIndex+1; i < words.length; i++) {
//                if(words[wordIndex].equalsIgnoreCase(words[i]))
//                    frequencyCounter++;
//            }
//            if(frequencyCounter > mostFrequentCounter) {
//                mostFrequentCounter = frequencyCounter;
//                mostFrequentWord = words[wordIndex];
//            }
//        }
//        System.out.println(mostFrequentWord);

        String text = "Java is easy to learn, is easy to write, and is easy to debug";
        //Several words
        String[] words = text.split("\\s");
        StringBuilder mostFrequentWords = new StringBuilder();
        int mostFrequentCounter = Integer.MIN_VALUE;
        for(int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            int frequencyCounter = 1;
            for(int i = wordIndex+1; i < words.length; i++) {
                if(words[wordIndex].equalsIgnoreCase(words[i]))
                    frequencyCounter++;
            }
            if(frequencyCounter > mostFrequentCounter) {
                mostFrequentCounter = frequencyCounter;
                mostFrequentWords = new StringBuilder();
                mostFrequentWords.append(words[wordIndex]).append(" ");
            } else if(frequencyCounter == mostFrequentCounter) {
                mostFrequentWords.append(words[wordIndex]).append(" ");
            }
        }
        System.out.println(mostFrequentWords.toString().trim());


    }
}
