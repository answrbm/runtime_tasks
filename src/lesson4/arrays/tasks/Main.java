package lesson4.arrays.tasks;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(mergeSortedArrays(arr1,arr2)));
    }

    //Task of first complexity

    //Task1
    //1. Вывести первые 3 элемента массива (Вывести первые 3 элемента массива используя цикл for).
    public static void showFirstThreeElements(int[] nums) {
        for(int i = 0; i < 3; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task2
    //2. Вывести первую половину массива (Вывести первую половину элементов массива при помощи цикла for).
    public static void showFirstHalfOfArray(int[] nums) {
        for(int i = 0; i < nums.length/2; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task3
    //3. Вывести вторую половину массива (Вывести вторую половину элементов массива при помощи цикла for).
    // Реализация задачи должна работать при любом чётном количестве элементов.
    public static void showSecondHalfOfArray(int[] nums) {
        for(int i = nums.length/2;i < nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task4
    //4. Вывести все элементы кроме первого и последнего.
    public static void showAllElementsExceptForFirst(int[] nums) {
        for(int i = 1; i < nums.length-1; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task5
    //5. Вывести последние 3 элемента массива
    // (Для массива [7, -3, 9, -11, 18, 99, 2, 11] вывод должен быть таким: 99, 2, 11)
    public static void showOnlyLastThreeElements(int[] nums) {
        for(int i = nums.length - 3; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task6
    //6. Вывести чётные элементы массива по порядку (Вывести только чётные элементы массива по порядку (каждый второй элемент).
    // Необходимо будет вывести второй, четвёртый, шестой и т.д. элементы.
    // Позиции (индексы) для необходимых элементов: 1, 3, 5...n (постоянное увеличение на 2).
    public static void showOnlyEvenElements(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) System.out.println(nums[i]);
        }
    }

    //Task7
    //7. Вывести количество положительных и отрицательных элементов
    // (Необходимо определить количество положительных и отрицательных элементов в массиве и вывести его).
    // В реализации задачи понадобится определить 2 переменные для хранения количества элементов:
    // Одна переменная для хранения количества положительных элементов, допустим positiveCount.
    // Вторая для хранения количества отрицательных элементов, допустим negativeCount.
    // Названия переменных можно выбирать на своё усмотрение.
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
    //8. Найти максимальный и минимальный элементы массива
    // (Необходимо определить максимальный и минимальный элементы в массиве и вывести их).
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
    //1. Вывести первую треть массива при помощи цикла do-while.
    //Реализация задачи должна работать при количестве элементов, кратном трем.
    public static void printFirstThirdUsingDoWhile(int[] nums) {
        int count = 0;
        do {
            System.out.print(nums[count] + " ");
            count++;
        } while(count < nums.length/3);
    }

    //Task2
    //2. Найти среднее арифметическое всех нечётных элементов массива.
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
    //3. Вывести элементы массива в обратном порядке, используя цикл for.
    //Начните с последнего элемента массива и двигайтесь к первому.
    public static void printArrayInReverseOrderUsingForLoop(int[] nums) {
        for(int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }

    //Task4
    //4. Вывести элементы массива, которые больше среднего арифметического всех его элементов.
    //Сначала вычислите среднее значение всех элементов массива, а затем выведите те из них, которые больше этого среднего значения.
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
    //5. Найти и вывести два наименьших уникальных элемента массива.
    //Необходимо учесть случаи, когда массив имеет повторяющиеся числа.
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
    //6. Перемешать элементы массива в случайном порядке.
    //Вам понадобится использовать функцию для генерации случайных чисел.
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
    //7. Найдите элемент массива, который делит массив на две части таким образом,
    // что сумма элементов влево от него равна сумме элементов справа от него.
    //Если такого элемента нет, верните соответствующее сообщение.
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
    //8. Найдите длину самой длинной подпоследовательности, состоящей из одинаковых чисел.
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

    //Tasks of third complexity

    //Task1
    //1. Развернуть элементы массива таким образом, чтобы последний элемент стал первым, предпоследний стал вторым и т. д..
    public static void reverseArrayElements(int[] nums) {
        System.out.println("Before reverse:");
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        System.out.println("After reverse:");
        System.out.println(Arrays.toString(nums));
    }

    //Task2
    //2. Найти элемент массива, у которого сумма всех элементов слева от него равна сумме всех элементов справа от него.
    // Если таких элементов несколько, верните их все.
    public static void findElementsToSplitArray(int[] nums) {
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
            }
        }
    }

    //Task3
    //3. Дан массив чисел. Найдите самую длинную подпоследовательность, в которой все числа идут по возрастанию.
    public static void findAscendingLongestNumberSequenceLength(int[] nums) {
        int maxLength = 0;
        int subsequenceCounter = 1;
        for (int starter = 0; starter < nums.length - 1; starter++) {
            if(starter < nums.length - 1) {
                if (nums[starter + 1] - nums[starter] == 1) {
                    subsequenceCounter++;
                } else {
                    subsequenceCounter = 1;
                }
            }
        }
        maxLength = subsequenceCounter;
        System.out.println(maxLength);
    }

    //Task4
    //4. Переместить все нули в конец массива, сохраняя порядок остальных элементов.
    //Пример:
    //Ввод: {0, 1, 9, 0, 3, 12, 0}
    //Ожидаемый вывод: {1, 9, 3, 12, 0, 0, 0}
    public static void rearrangeZerosToTheEnd(int[] nums) {
        int[] rearrangedArray = new int[nums.length];
        int index = 0;
        for(int num : nums) {
            if(num != 0) {
                rearrangedArray[index] = num;
                index++;
            }
        }
        System.out.println(Arrays.toString(rearrangedArray));
    }

    //Task5
    //5. Наибольшая сумма подпоследовательности: Найти подмассив с наибольшей суммой в массиве целых чисел.
    //Пример:
    //Ввод: {−2, 1, −3, 4, −1, 2, 1, −5, 4}
    //Ожидаемый вывод: {4, −1, 2, 1} с суммой 6
    public static void findMaximumSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0;
        int end = 0;
        for(int i = 1; i < nums.length; i++) {
            if(currentSum + nums[i] < nums[i]) {
                currentSum = nums[i];
                start = i;
            } else {
                currentSum += nums[i];
            }

            if(maxSum < currentSum) {
                maxSum = currentSum;
                end = i;
            }
        }
        int[] subsequenceArray = Arrays.copyOfRange(nums,start,end+1);
        System.out.println("Max sum: " + maxSum);
        System.out.println(Arrays.toString(subsequenceArray));
    }

    //Task6
    //6. Циклический сдвиг массива: Реализовать функцию, которая будет циклически сдвигать массив на n позиций вправо.
    //Пример:
    //Ввод: {1, 2, 3, 4, 5} сдвиг на 2
    //Ожидаемый вывод: {4, 5, 1, 2, 3}
    public static void rotateArrayRight(int[] nums, int n) {
        int[] rotatedArray = new int[nums.length];
        if(n > nums.length)
            n = n%nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(i+n <= nums.length-1)
                rotatedArray[i+n] = nums[i];
            else {
                int index = Math.abs(n-(nums.length-i));
                rotatedArray[index] = nums[i];
            }
        }
        System.out.println(Arrays.toString(rotatedArray));
    }

    //Task7
    //7. Удаление дубликатов из отсортированного массива: Реализовать функцию, которая удаляет все дубликаты из отсортированного массива и возвращает новую длину массива.
    //Пример:
    //Ввод: {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
    //Ожидаемый вывод: {0, 1, 2, 3, 4} с новой длиной 5.
    public static void removeDuplicates(int[] nums) {
        int[] distinctArray = new int[nums.length];
        int counter = 0;
        boolean hasZero = false;
        for (int num : nums) {
            for (int j = 0; j < distinctArray.length; j++) {
                if (num == distinctArray[j]) {
                    if (num == 0 && !hasZero) {
                        hasZero = true;
                        counter++;
                    }
                    break;
                }
                if (j == distinctArray.length - 1) {
                    distinctArray[counter] = num;
                    counter++;
                }
            }
        }
        distinctArray = Arrays.copyOf(distinctArray,counter);
        System.out.println(Arrays.toString(distinctArray));
    }

    //Tasks of fourth complexity

    //Task1
    //Найдите и верните наибольшую разницу между двумя элементами в массиве, где меньший элемент предшествует большому.
    public static int maxDifference(int[] arr) {
        int maxDifference = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int difference = arr[j] - arr[i];
                    if (difference > maxDifference)
                        maxDifference = difference;
                }
            }
        }
        return maxDifference;
    }

    //Task2
    //Напишите функцию, которая принимает на вход массив и число n и "вращает" массив на n позиций вправо.
    public int[] rotate(int[] arr, int n) {
        int[] rotatedArray = new int[arr.length];
        if(n > arr.length)
            n = n%arr.length;
        for(int i = 0; i < arr.length; i++) {
            if(i+n <= arr.length-1)
                rotatedArray[i+n] = arr[i];
            else {
                int index = Math.abs(n-(arr.length-i));
                rotatedArray[index] = arr[i];
            }
        }
        return rotatedArray;
    }

    //Task3
    //Найдите элемент, который встречается в массиве наибольшее количество раз.
    // Если таких элементов несколько, верните любой из них
    public static int mostFrequent(int[] arr) {
        int maxCount = 0;
        int elem = 0;
        for (int k : arr) {
            int count = -1;
            for (int i : arr) {
                if (k == i)
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                elem = k;
            }
        }
        return elem;
    }

    //Task4
    //Напишите функцию, которая принимает на вход массив целых чисел и целое число target.
    // Найдите два числа в массиве, которые в сумме дают target, и верните их в виде массива.
    // Если таких чисел нет, верните пустой массив.
    public static int[] twoSum(int[] arr, int target) {
        int[] twoSumDigits = new int[2];
        for(int numOuter : arr) {
            for(int numInner : arr) {
                if(numOuter + numInner == target) {
                    twoSumDigits[0] = numOuter;
                    twoSumDigits[1] = numInner;
                    break;
                }
            }
        }
        return twoSumDigits;
    }

    //Task5
    //У вас есть два отсортированных массива.
    // Напишите функцию, которая сливает их в один отсортированный массив.
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] sortedArray = new int[arr1.length + arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            sortedArray[i] = arr1[i];
            count++;
        }
        for (int j : arr2) {
            sortedArray[count++] = j;
        }

        int n = 0;
        while(n < sortedArray.length) {
            for (int i = 0; i < sortedArray.length - 1 - n; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                }
            }
            n++;
        }
        return sortedArray;
    }

}
