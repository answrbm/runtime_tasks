package lesson19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("src/lesson19/example.txt"));
//
//        Map<String,Integer> letters = new HashMap<>();
//        while(reader.ready()) {
//            String letter = reader.readLine();
//            if(letters.containsKey(letter)) {
//                Integer counter = letters.get(letter);
//                counter++;
//                letters.put(letter,counter);
//            } else {
//                letters.put(letter,1);
//            }
//        }
//
//        for(Map.Entry<String, Integer> letter : letters.entrySet()) {
//            System.out.println(letter.getKey() + " : " + letter.getValue());
//        }
//
//        reader.close();


        BufferedReader reader = new BufferedReader(new FileReader("src/lesson19/products.csv"));

        Map<String,Integer> products = new HashMap<>();
        reader.readLine();

        String maxProductName = "";
        int maxProductPrice = Integer.MIN_VALUE;

        String minProductName = "";
        int minProductPrice = Integer.MAX_VALUE;

        while(reader.ready()) {
            String[] productRow = reader.readLine().split(",");
            String productName = productRow[0];
            int productPrice = Integer.parseInt(productRow[1]);
            if(productPrice > maxProductPrice) {
                maxProductName = productName;
                maxProductPrice = productPrice;
            }
            if(productPrice < minProductPrice) {
                minProductName = productName;
                minProductPrice = productPrice;
            }
            products.putIfAbsent(productName,productPrice);
        }

        System.out.println("Max product price: " + maxProductName + ": " + maxProductPrice);
        System.out.println("Min product price: " + minProductName + ": " + minProductPrice);
        System.out.println(products);

        reader.close();
    }

}
