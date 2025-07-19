package Arrays.Easy;

import java.util.Scanner;
// Here we will find the longest subarray with sum == K
public class LongestSubArrayWithKSum {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s = in.nextInt();
        System.out.println("Enter the sum for which to find the longest sum: ");
        int k = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[s];
        for(int i=0; i<s; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Longest length : "+findlongestSubArray(arr, k));
    }
    public static int findlongestSubArray(int [] nums, int k){
        int n = nums.length;
        // brute force approach
        int longest = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int z=i; z<=j;z++){
                    sum += nums[z];
                }
                if(sum == k){
                    longest = Math.max(longest,j-i+1);
                }
            }
        }
        return longest;
    }
}
