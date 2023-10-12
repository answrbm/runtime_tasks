package lesson4.arrays.tasks;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    }

    //Task of first complexity

    //Task1
    public void showFirstThreeElements(int[] nums) {
        for(int i = 0; i < 3; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task2
    public void showFirstHalfOfArray(int[] nums) {
        for(int i = 0; i < nums.length/2; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task3
    public void showSecondHalfOfArray(int[] nums) {
        for(int i = nums.length/2;i < nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task4
    public void showAllElementsExceptForFirst(int[] nums) {
        for(int i = 1; i < nums.length-1; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task5
    public void showOnlyLastThreeElements(int[] nums) {
        for(int i = nums.length - 3; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task6
    public void showOnlyEvenElements(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) System.out.println(nums[i]);
        }
    }

    //Task7
    public void countPositiveAndNegativeElements(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;
        for(int num : nums) {
            if(num >= 0) positiveCount++;
            else negativeCount++;
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
    }

    //Tasks of second complexity

    //Task1
    public void printFirstThirdUsingDoWhile(int[] nums) {
        int count = 0;
        do {
            System.out.print(nums[count] + " ");
            count++;
        } while(count < nums.length/3);
    }

    //Task2
    public void findAverageOfOddElements(int[] nums) {
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
    }

    //Task3
    public void printArrayInReverseOrderUsingForLoop(int[] nums) {
        for(int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task4
    public void printElementsGreaterThanAverage(int[] nums) {
        int sum2 = 0;
        int avg2;
        for(int num : nums)
            sum2 += num;
        avg2 = sum2/nums.length;
        for(int num : nums)
            if(num > avg2) System.out.println(num);
    }

    //Task5
    public void findAndPrintTwoSmallestUniqueElements(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int num1 : nums) {
            int uniqueCount = 0;
            for(int num2 : nums) {
                if(num1 == num2) uniqueCount++;
            }
            if(uniqueCount == 1) {
                if(num1 < min1) {
                    int temp = min1;
                    min1 = num1;
                    min2 = temp;
                } else if(num1 < min2) {
                    min2 = num1;
                }
            }
        }
        System.out.println(min1);
        System.out.println(min2);
    }

    //Task6
    public void shuffleArray(int[] nums) {
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
