package lesson4.arrays.tasks;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] nums = {10,1,5,-5,2,284};
        findMaxAndMinElements(nums);
    }

    //Task of first complexity

    //Task1
    public static void showFirstThreeElements(int[] nums) {
        for(int i = 0; i < 3; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task2
    public static void showFirstHalfOfArray(int[] nums) {
        for(int i = 0; i < nums.length/2; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task3
    public static void showSecondHalfOfArray(int[] nums) {
        for(int i = nums.length/2;i < nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task4
    public static void showAllElementsExceptForFirst(int[] nums) {
        for(int i = 1; i < nums.length-1; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task5
    public static void showOnlyLastThreeElements(int[] nums) {
        for(int i = nums.length - 3; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task6
    public static void showOnlyEvenElements(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) System.out.println(nums[i]);
        }
    }

    //Task7
    public static void countPositiveAndNegativeElements(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;
        for(int num : nums) {
            if(num >= 0) positiveCount++;
            else negativeCount++;
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
    }

    //Task8
    public static void findMaxAndMinElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) max = num;
            if(num < min) min = num;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    //Tasks of second complexity

    //Task1
    public static void printFirstThirdUsingDoWhile(int[] nums) {
        int count = 0;
        do {
            System.out.print(nums[count] + " ");
            count++;
        } while(count < nums.length/3);
    }

    //Task2
    public static void findAverageOfOddElements(int[] nums) {
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
    public static void printArrayInReverseOrderUsingForLoop(int[] nums) {
        for(int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task4
    public static void printElementsGreaterThanAverage(int[] nums) {
        int sum2 = 0;
        int avg2;
        for(int num : nums)
            sum2 += num;
        avg2 = sum2/nums.length;
        for(int num : nums)
            if(num > avg2) System.out.println(num);
    }

    //Task5
    public static void findAndPrintTwoSmallestUniqueElements(int[] nums) {
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
    public static void shuffleArray(int[] nums) {
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

    //Task7
    public static void findElementToSplitArray(int[] nums) {
        for(int num1 = 1; num1 < nums.length; num1++) {
            int sum1 = 0;
            int sum2 = 0;
            for(int index = 0; index < num1; index++) {
                sum1 += nums[index];
            }
            for(int num2 = num1 + 1; num2 < nums.length; num2++) {
                sum2 += nums[num2];
            }
            if(sum1 == sum2) {
                System.out.println("Element was found: " + nums[num1]);
                break;
            }
        }
    }

    //Task8
    public static void findLongestEqualNumberSequenceLength(int[] nums) {
        int maxLength = 0;
        for (int starter = 0; starter < nums.length; starter++) {
            int subsequenceCounter = 1;
            for (int index = starter+1; index < nums.length; index++) {
                if (nums[starter] == nums[index])
                    subsequenceCounter++;
                else
                    break;
            }
            if (subsequenceCounter > maxLength && subsequenceCounter > 1)
                maxLength = subsequenceCounter;
        }
        System.out.println(maxLength);
    }

}
