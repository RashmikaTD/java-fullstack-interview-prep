/******************************************************************************
Convert Number to words 


Example: Input -> 412

Output: Four Hundred and twelve


Call numberToWords(n)
  │
  ▼
Initialize arrays:
  ├─ ones = {"", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine"}
  ├─ teens = {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"}
  └─ tens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"}
  │
Initialize empty StringBuilder result
  │
Check hundreds place (n / 100 > 0)
  ├─ If yes:
  │     ├─ Append ones[n/100]
  │     └─ Append " hundred and "
  │
Check last two digits (rem = n % 100)
  │
Is rem > 10 and rem < 20? (Teens check)
  ├─ Yes → Append teens[rem - 10]
  └─ No → Continue
       │
       ▼
Is rem < 10?
  ├─ Yes → Append ones[rem]
  └─ No → (Tens & Ones)
         ├─ Append tens[rem / 10]
         ├─ Append space
         └─ Append ones[rem % 10]
  │
  ▼
Return result.toString()



*******************************************************************************/
import java.util.*;
public class Main
{
    static final String[] ones = {"", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    static final String[] teens = {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    static final String[] tens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(numberToWords(n));
		
	}
	
	public static String numberToWords(int n){
	  
	   StringBuilder result = new StringBuilder();
	   if(n/100>0){
	       result.append(ones[n/100]);
	       result.append(" hundred and ");
	   }
	   if(n%100>10 && n%100<20){
	       result.append(teens[(n%100)-10]);
	   }
	   else if (n%100<10){
	       result.append(ones[n%100]);
	   }
	   else{
	      n=n%100;
	      result.append(tens[n/10]); 
	      result.append(" ");
	      result.append(ones[n%10]);
	   }
	   return result.toString();
	}
	
	
}
