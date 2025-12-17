/******************************************************************************
Twisted Prime

A number is twisted prime if the number and it reverse are prime.

Example: Input -> 97
{79 and 97 are prime}

Output -> Twisted Prime

Call isPrime(n)
  │
  ▼
Inside isPrime:
  ├─ Calculate range = (n + 1) / 2
  ├─ Loop i = 2 to range - 1
  │     ├─ If n % i == 0
  │     │      └─ Return false (n is not prime)
  │     └─ Else continue
  └─ Loop ends → Return true (n is prime)
  
  
  
  Call reverseNumber(num)
  │
  ▼
  Inside reverseNumber:
  ├─ Initialize result = 0
  ├─ While num > 0
  │     ├─ rem = num % 10
  │     ├─ num = num / 10
  │     └─ result = result * 10 + rem
  └─ Loop ends → Return result

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
		System.out.println((isPrime(n) && isPrime(reverseNumber(n)))?"Twisted Prime": "Not Twisted Prime" );
		
	}
	
	public static boolean isPrime(int n){
	    int range = (n+1)/2;
	    for(int i=2;i<range;i++){
	       // System.out.println("n%i:"+n%i);
	        if(n%i==0){
	            return false;
	        }
	    }
	    return true;
	}
	
	public static int reverseNumber(int num){
	    int result = 0;
	    while(num>0){
	        int rem = num % 10;
	        num = num /10;
	        result = result * 10 + rem;
	    }
	    return result;
	}
}
