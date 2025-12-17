/******************************************************************************
Sort the number by factor count

The program takes an array of numbers and sorts them based on the count of their factors in descending order.

Example: [5, 9, 8, 6]
Answer: [8, 6, 9, 5]

Call sortNumbersByFactorCount(nums)
  │
  ▼
Inside sortNumbersByFactorCount:
  ├─ Loop i = 0 to nums.length - 1
  │
  ▼
  Loop j = 0 to nums.length - 1
      ├─ Call getFactorCount(nums[i])
      ├─ Call getFactorCount(nums[j])
      ├─ Compare factor counts
      │      ├─ If factorCount(nums[i]) > factorCount(nums[j])
      │      │     └─ Swap nums[i] and nums[j]
      │      └─ Else continue
      │
  ▼
Return sorted nums array

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element the array:");
		int n = sc.nextInt();
		System.out.println("Enter the numbers");
		int nums[] = new int[n];
		for(int i=0;i<n;i++){
		   nums[i]=sc.nextInt(); 
		}
		if(n==1){
		    System.out.println("Sorted Array:" + nums[0]);
		}
		int sortednums[] =sortNumbersByFactorCount(nums);
		System.out.println("Sorted Array:");
		for(int i = 0;i<n;i++){
		  System.out.println(sortednums[i]);
		}
		
		
	}
	
	public static int[] sortNumbersByFactorCount(int[] nums){
	    for(int i=0;i<nums.length;i++){
	        for(int j=0;j<nums.length;j++){
	            if(getFactorCount(nums[i])>getFactorCount(nums[j])){
	                int temp = nums[i];
	                nums[i] =  nums[j];
	                nums[j] = temp;
	                
	            }
	        }
	    }
	    return nums;
	}
	
	public static int getFactorCount(int num){
	    int count = 0;
	    for(int i=1; i<=num ;i++){
	        if(num%i==0)
	            count++;
	    }
	    return count;
	}
}
