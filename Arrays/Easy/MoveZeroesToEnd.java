package Arrays.Easy;

import java.util.Scanner;

public class MoveZeroesToEnd
{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = in.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the Array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        moveZeroes(arr);
        System.out.println("Output: ");
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
    public static void moveZeroes(int [] nums){
        int z = 0; // its a pointer which keeps track of every position where next non-zero element should be placed.
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[z];
                nums[z] = nums[i];
                nums[i] = temp;
                z++;
            }
        }
    }
}
