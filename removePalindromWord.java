/******************************************************************************
 Remove Palindrom word in the given String

palindrome have 2 points to check the palidrome. use while loop.
*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = "Hari speaks Malayalam";
		String words[] = str.split(" ");
		for(String w : words){
		    if(!isPalindrome(w)){
		        System.out.print(w+" ");
		    }
		}
		
	}
	
	public static boolean isPalindrome(String word){
	   // char letter[] = word.toCharArray();
	    word = word.toLowerCase();
	    int front=0;
	    int end=word.length()-1;
	    while(front<=end){
	        if(word.charAt(front)!=word.charAt(end)){
	            return false;
	        }
	        front++;
	        end--;
	    }
	    return true;
	}
	
}
