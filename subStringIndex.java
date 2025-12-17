/******************************************************************************
Find substring Index

A number is twisted prime if the number and it reverse are prime.

Example: Input ->
Str1:test123string
substring: 123


Call subStringIndex(s, sub)
  │
  ▼
Inside subStringIndex:
  ├─ Check if sub.length > s.length
  │     ├─ Yes → return -1
  │     └─ No → continue
  │
  ▼
  Loop i = 0 to (s.length - sub.length)
      ├─ Initialize j
      │
      ▼
      Loop j = 0 to sub.length
          ├─ Compare s.charAt(i + j) with sub.charAt(j)
          │     ├─ If not equal → break inner loop
          │     └─ Else continue
      │
      ▼
      After inner loop:
      ├─ If j == sub.length
      │     └─ return i (substring found at index i)
      └─ Else continue outer loop
  │
  ▼
If loop ends and no match found
  └─ return -1


*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s = "test123string";
		String sub = "123";
		System.out.println(subStringIndex(s,sub));
		
	}
	
	public static int subStringIndex(String s, String sub){
	   if(sub.length()>s.length()){
	       return -1;
	   }
	   for(int i =0; i< s.length()-sub.length(); i++){
	       int j;
	       for(j=0;j<sub.length();j++){
	            if(s.charAt(i+j)!=sub.charAt(j))
	                break;    
	       }
	       if(j==sub.length())
	            return i;
	   }
	   return -1;
	}
	
	
}
