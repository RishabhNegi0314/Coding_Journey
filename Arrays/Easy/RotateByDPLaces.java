package Arrays.Easy;
// Rotate the array by d places

import java.util.Scanner;

public class RotateByDPLaces {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = in.nextInt();

        System.out.println("Enter the array elements: ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the number of places you want to rotate(to left). ");
        int d = in.nextInt();
        rotate(arr,d);
        System.out.println("The Array after sorting it with "+ d + "elements is: ");
        for(int x: arr){
            System.out.print(x+ " ");
        }
    }
    public static void rotate(int [] nums, int r){
        int n = nums.length;
        r = r%n - 1; // because we are taking indexing from 0
        reverse(nums, 0, r);
        reverse(nums, r+1, n-1);
        reverse(nums, 0, n-1);
    }
    public static void reverse(int [] nums, int i, int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

    }
}
