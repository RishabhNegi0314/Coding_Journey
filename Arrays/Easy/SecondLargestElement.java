package Arrays.Easy;
import java.util.*;
public class SecondLargestElement {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int [n];
        for(int i=0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("These are the array elements: ");
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println("\n"+ "The Second Largest number is : "+ findSecondLargest(arr));
    }
    public static int findSecondLargest(int [] nums){
        int largest = nums[0];
        int secondlargest = -1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>largest && secondlargest != nums[i]){
                secondlargest = largest;
                largest = nums[i];
            }
        }
        return secondlargest;
    }
}
