package Arrays.Easy;
import java.util.*;
public class LargestElement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.println("Enter the array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Largest Element is: ");
        System.out.println(largest(arr));
    }
    public static int largest(int [] nums){
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
}
