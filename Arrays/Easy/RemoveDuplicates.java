
// Algo:
// 1) If the array is not sorted, sort it. (I'm Considering the array is SORTED)
// 2) Brute Force you can use a set or directly replace in-place of the array.
package Arrays.Easy;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: " + "\n");
        int n = in.nextInt();

        int [] arr = new int [n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        Sort(arr);
        System.out.println("After Sorting: ");
        for(int x: arr){
            System.out.print(x);
        }
        System.out.println("\n");
        removeDuplicates(arr);

        for(int x: arr){
            System.out.println(x);
        }
    }
// Created a sort function if the array is not sorted.
    public static void Sort(int [] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j< nums.length-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static int [] removeDuplicates(int [] nums){
        // here I used sets
//        Set <Integer> st = new HashSet<>();
//        int index = 0;
//        for(int i=0; i<nums.length; i++){
//            if(!st.contains(nums[i])){
//                st.add(nums[i]);
//                nums[index] = nums[i];
//                index ++;
//            }
//        }
//        while (index< nums.length){
//            nums[index++] = 0;
//        }


        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        // because till here "i" points to the last unique element so we have to fill after it.
        i++;
        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
        return nums;
    }

}
