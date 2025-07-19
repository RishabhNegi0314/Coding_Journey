package Arrays.Medium;

import java.util.Scanner;

// To find the maximum sum of the sub array
public class KadanesAlgo
{
    public static int result(int [] arr){
        int n = arr.length;
        int i = 1;
        int j = n-1;
        int sum = arr[0];
        int max = arr[0];

        while(i<j){
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
            i++;
        }
        return max;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();

        System.out.println("Enter the array elements: ");
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("The maximum subarray is: "+ result(arr));
    }
}
