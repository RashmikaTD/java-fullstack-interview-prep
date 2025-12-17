/******************************************************************************
Fibonacci Numbers in Array

Print only the numbers present in Fibonacci series present in the array

Example: Input -> [1 10 6 8 13 21]

Output -> [1 8,13, 21]

Call findFibonacciNumbersInArray(nums)
      │
      ▼
  Inside findFibonacciNumbersInArray:
      ├─ Initialize empty ArrayList fibNums
      ├─ Loop i = 0 to nums.length - 1
      │     ├─ Call isFibonacciNumber(nums[i])
      │     │      │
      │     │      ▼
      │     │  Inside isFibonacciNumber(num):
      │     │      ├─ Initialize a = 0, b = 1
      │     │      ├─ While a <= num
      │     │      │     ├─ If a == num → return true
      │     │      │     ├─ next = a + b
      │     │      │     ├─ a = b
      │     │      │     └─ b = next
      │     │      └─ End while → return false
      │     │
      │     └─ If isFibonacciNumber(nums[i]) == true
      │           └─ Add nums[i] to fibNums
      │
      └─ Return fibNums to main
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
		
		ArrayList<Integer> fibonacciNums = findFibonacciNumbersInArray(nums);
		System.out.println("FibonacciNumbers:");
		for(Integer f : fibonacciNums){
		  System.out.println(f);
		}
		
		
	}
	
	public static ArrayList<Integer> findFibonacciNumbersInArray(int[] nums){
	    ArrayList<Integer> fibNums = new ArrayList<>();
	    for(int i=0;i<nums.length;i++){
	        if(isFibonacciNumber(nums[i])){
	            fibNums.add(nums[i]);
	        }
	    }
	    return fibNums;
	}
	
	public static boolean isFibonacciNumber(int num){
	    int a = 0;
	    int b = 1;
	    while(a<=num){
	        if(a==num)
	            return true;
	        int next = a+b;
	        a = b;
	        b = next;
	    }
	    return false;
	}
}
