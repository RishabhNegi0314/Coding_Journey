package Arrays.Easy;

import java.util.Scanner;

public class MissingArrayElement {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("The missing element is : "+ findMissingElement(arr));
    }
    public static int findMissingElement(int [] nums){
        // solved using sum formula
        /*
        int l = nums.length;
        int expSum = (l * (l+1))/2;
        int sum = 0;
        for(int i=0; i<l; i++){
            sum += nums[i];
        }
        return expSum - sum;
        */

        // solved using xor (Bit Manipulation)
        int xor = 0;
        int nxor = 0;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }
        for(int i=0; i<nums.length + 1; i++){
            nxor = nxor ^ i;
        }
        return (xor ^ nxor);
    }
}
