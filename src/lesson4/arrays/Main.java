package lesson4.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //тип[] имя_переменной = new тип[]

//        int[] numbers = {4,3,5,2,1};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//        for(int i = 0; i < numbers.length; i++) {
//            if(numbers[i] > numbers[i+1]) {
//                int temp = numbers[i];
//                numbers[i] = numbers[i+1];
//                numbers[i+1] = temp;
//            }
//        }

        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11, 5};
//        //1
//        for(int i = 0; i < 3; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        //2
//        for(int i = 0; i < nums.length/2; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        //3
//        for(int i = nums.length/2;i < nums.length;i++) {
//            System.out.print(nums[i] + " ");
//        }
//        //4
//        for(int i = 1; i < nums.length-1; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        //5
//        for(int i = nums.length - 3; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        //6
//        for(int i = 0; i < nums.length; i++) {
//            if(i % 2 == 0) System.out.println(nums[i]);
//        }
//        //7
//        int positiveCount = 0;
//        int negativeCount = 0;
//        for(int num : nums) {
//            if(num >= 0) positiveCount++;
//            else negativeCount++;
//        }

//        //1
//        int count = 0;
//        do {
//            System.out.print(nums[count] + " ");
//            count++;
//        } while(count < nums.length/3);
//        System.out.println();
//        //2
//        int sum1 = 0;
//        int counter = 0;
//        int avg1;
//        for(int num : nums) {
//            if (num % 2 != 0) {
//                sum1 += num;
//                counter++;
//            }
//        }
//        avg1 = sum1/counter;
//        System.out.print(avg1);
//        System.out.println();
//        //3
//        for(int i = nums.length-1; i >= 0; i--) {
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
//        //4
//        int sum2 = 0;
//        int avg2;
//        for(int num : nums)
//            sum2 += num;
//        avg2 = sum2/nums.length;
//        for(int num : nums)
//            if(num > avg2) System.out.println(num);
        //5
//        int min1 = Integer.MAX_VALUE;
//        int min2 = Integer.MAX_VALUE;
//        for(int num1 : nums) {
//            int uniqueCount = 0;
//            for(int num2 : nums) {
//                if(num1 == num2) uniqueCount++;
//            }
//            if(uniqueCount == 1) {
//                if(num1 < min1) {
//                    int temp = min1;
//                    min1 = num1;
//                    min2 = temp;
//                } else if(num1 < min2) {
//                    min2 = num1;
//                }
//            }
//        }
//        System.out.println(min1);
//        System.out.println(min2);
        //6
        System.out.println("Before shuffle: " + Arrays.toString(nums));
        Random rn = new Random();
        int maximum = nums.length-1;
        int minimum = 0;
        for(int i = 0; i < nums.length; i++) {
            int randomNum = rn.nextInt(maximum - minimum) + minimum;
            int temp = nums[randomNum];
            nums[randomNum] = nums[i];
            nums[i] = temp;
        }
        System.out.println("After shuffle: " + Arrays.toString(nums));
    }

}
