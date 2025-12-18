/******************************************************************************
Matrix Addition

Add the each array element

This question has multiple 1D array

[1 2 3]
[4 5 6]

Ans:579

*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number of arrays");
		int n = sc.nextInt();
		for(int i = 0; i<n ; i++){
		    System.out.println("Enter array "+(i+1)+" size");
		    int size = sc.nextInt();
		    System.out.println("Enter the array "+(i+1)+ " elements");
		    int array[] = new int[size];
		    for(int j = 0 ; j<size; j++){
		        array[j] = sc.nextInt();
		    }
		    sum += arrayToNumbers(array);
		}
		System.out.println("Sum is "+sum);
		
	}
	
	public static int arrayToNumbers(int[] a){
	    int number = 0;
	    
	    for(int i = 0; i<a.length ; i++){
	        
	        number = (number*10) + a[i];
	    }
	   // System.out.println(number);
	    return number;
	}
	
}
