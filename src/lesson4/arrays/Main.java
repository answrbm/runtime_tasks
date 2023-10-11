package lesson4.arrays;

import java.util.Arrays;

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

        //1
        int count = 0;
        do {
            System.out.print(nums[count] + " ");
            count++;
        } while(count < nums.length/3);
        System.out.println();
        //2
        int sum1 = 0;
        int counter = 0;
        int avg1;
        for(int num : nums) {
            if (num % 2 != 0) {
                sum1 += num;
                counter++;
            }
        }
        avg1 = sum1/counter;
        System.out.print(avg1);
        System.out.println();
        //3
        for(int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        //4
        int sum2 = 0;
        int avg2;
        for(int num : nums)
            sum2 += num;
        avg2 = sum2/nums.length;
        for(int num : nums)
            if(num > avg2) System.out.println(num);
        //5
        int uniqueCount = 0;
        for(int i = 0; : nums) {
            for(int num : nums) {

            }
        }
    }
}
