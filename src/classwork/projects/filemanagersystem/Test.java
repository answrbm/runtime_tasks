package classwork.projects.filemanagersystem;

import classwork.projects.filemanagersystem.exceptions.*;

import java.nio.file.FileAlreadyExistsException;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
//        FileManager fileManager = new FileManager();
//        fileManager.createDirectory("d1");
//        fileManager.createDirectory("d2");
//        fileManager.createFile("d1","f1",true);
//        fileManager.createFile("d2","f2",false);
//
//        fileManager.showDirectoriesAndFiles();
//        System.out.println("___");
//        fileManager.moveFile("d1","f2");
//        fileManager.showDirectoriesAndFiles();
//        System.out.println("___");
//        fileManager.moveFile("d2","f2");
//        fileManager.showDirectoriesAndFiles();

        int[] nums = {10,5,9,3,6,8,7,1,4,2};

        System.out.println("Before: " + Arrays.toString(nums));
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = i+1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }

        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == nums.length) {
                break;
            }
            if(i != nums.length-1) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            } else {
                i = 0;
                count++;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            int pivot = nums[nums.length/2];
            if(nums[i] > pivot) {
                int temp = nums[i];
                nums[i] = nums[nums.length/2];
                nums[nums.length/2] = temp;
            }
        }
        System.out.println("After: " + Arrays.toString(nums));

    }
}
