package Arrays.Medium;

// Dutch National Flag Algorithm
import java.util.Scanner;

public class SortZeroOneTwo {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        sort(arr);
        System.out.println("Sorted Array: ");
        for(int x: arr){
            System.out.print(x + " ");
        }
    }

    // Here is the implementation of the Algo
    public static void sort(int [] nums){
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n -1;

        while(mid<=high){

            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }

    }
    public static void swap(int [] arr, int x,int y ){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
