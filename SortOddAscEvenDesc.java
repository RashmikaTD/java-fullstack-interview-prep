/******************************************************************************

We need to sperate the array as odd and even with out new array;

We need to have apointe odd with is initially 0; and this is only incremented with the number is odd
We need to loop through the array

If the number is odd, swap num[i] and num[odd];

the value of i increments ever time but odd pointer increments only when the number is odd -> (Two pointer)

As the odd pointer is only increment the number is odd the odd numbers are moved to front.

Then with the odd point Separate the array as odd and eve.

0-odd pointer-1 -> odd
odd pointer - array length -> even

then sort the arrays



*******************************************************************************/
import java.util.*;
public class Main
{
    
    public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 8, 11, 6, 2, 1, 7};
        int n = nums.length;

        // Separate odd and even in original array using partitioning
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                // Swap odd to the front
                int temp = nums[i];
                nums[i] = nums[oddCount];
                nums[oddCount] = temp;
                oddCount++;
            }
        }

        // nums[0..oddCount-1] → odd numbers
        // nums[oddCount..n-1] → even numbers

        // Sort odd numbers ascending
        bubbleSort(nums, 0, oddCount - 1, true);

        // Sort even numbers descending
        bubbleSort(nums, oddCount, n - 1, false);

        // Print array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // Bubble sort with ascending/descending option
    public static void bubbleSort(int[] arr, int start, int end, boolean ascending) {
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end - 1; j++) {
                if (ascending ? arr[j] > arr[j + 1] : arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

	
}
