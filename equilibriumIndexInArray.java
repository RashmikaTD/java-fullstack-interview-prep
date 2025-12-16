/******************************************************************************

Equilibrium Index in Array

The sum of elements to the left of the index is equal to the sum of elements to the right of the index.

Example:
Array = [1, 3, 5, 2, 2]
Answer: 5


├─ Initialize totalSum = 0
  ├─ Initialize leftSum = 0
  │
  ▼
  Loop i = 0 to arr.length-1
      └─ totalSum = totalSum + arr[i]
  │
  ▼
  Loop i = 0 to arr.length-1
      ├─ totalSum = totalSum - arr[i]
      ├─ If totalSum == leftSum ?
      │      ├─ Yes → return i (equilibrium index)
      │      └─ No → continue
      ├─ leftSum = leftSum + arr[i]
  │
  ▼
  Return -1 (no equilibrium index)

*******************************************************************************/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        int[] arr = new int[n];
        System.out.println("Enter the n numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = equilibriumIndexInArray(arr);
        if(result!=-1)
            System.out.println("Equilibrium Point is "+arr[result]);
        else
            System.out.println("No Equilibrium Point");
        
    }

    public static int equilibriumIndexInArray(int arr[]){
        int totalSum = 0;
        int leftSum = 0;
        for(int i=0;i<arr.length;i++){
            totalSum += arr[i];
        }
        for(int i=0;i<arr.length;i++){
            totalSum -= arr[i];
            
            if(totalSum == leftSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
