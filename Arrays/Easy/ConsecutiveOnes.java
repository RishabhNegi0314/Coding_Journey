package Arrays.Easy;

// Idea is to find the maximum number of consecutive ones

import java.util.Scanner;

public class ConsecutiveOnes {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Binary Array: ");
        int n = in.nextInt();

        System.out.println("Enter a Binary Array");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("The number of maximum consecutive ones are: " + findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int [] nums){
        int temp = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                temp ++;
            }
            else if(nums[i] == 0){
                temp = 0;
            }
            if(temp>count) count = temp;
        }
        return count;
    }
}
