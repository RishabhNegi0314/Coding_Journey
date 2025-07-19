package Arrays.Easy;
// Left rotate the array by one place.

import java.util.Scanner;

public class LeftRotate {
    public static void display(int [] nums){
        System.out.println("Array: ");
        for(int x: nums){
            System.out.print(x + " ");
        }
    }
    public static void rotate(int [] nums){
        int temp = nums[0];
        for(int i=0; i<nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = temp;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        display(arr);
        rotate(arr);
        display(arr);
    }
}
