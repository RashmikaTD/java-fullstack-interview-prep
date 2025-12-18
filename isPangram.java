/******************************************************************************

Pangram or not

A pangram is a sentence that contains every letter of the alphabet at least once.

*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static void main(String[] args) {
		
		String str1 = "abcd eFGhi jKlnMO pqrst uvwxyz";
		String str2 = "abcd eFGhi jKlnMO pqrst";
		
		System.out.println(isPangram(str1)?"Pangram":"Not Pangram");
		System.out.println(isPangram(str2)?"Pangram":"Not Pangram");
		
	}
	public static boolean isPangram(String str){
	    boolean count[] = new boolean[26];

        String lowecaseString = str.toLowerCase();
		char strArray[] = lowecaseString.toCharArray();
		for(int i=0;i<strArray.length;i++){
		  //  System.out.println(lowecaseString.charAt(i));
		    char ch = lowecaseString.charAt(i);
		    if(ch>='a' && ch<='z'){
		        count[ch-'a']= true;
		      //  System.out.println(ch+":"+(ch-'a')+":"+count[ch-'a']);
		    }
		}
		for(int i=0 ;i<26;i++){
		  //  System.out.println(i+":"+count[i]);
		    if(!count[i]){
		        return false;
		    }
		}
		return true;
	}
	
}
