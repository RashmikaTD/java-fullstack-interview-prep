/******************************************************************************
Password Strength

it has 4 rules

if 1 rule satisfies - Weak
if 2 rule satisfies - Medium
if 3 rule satisfies - Good
if 4 rule satisfies - Strong
*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static void main(String[] args) {
		
		String password1 = "qwrst";
		String password2 = "Qwrst";
		String password3 = "Qw2ert";
		String password4 = "Qw2!ertsyu";
		
		System.out.println(passwordStrength(password1));
		System.out.println(passwordStrength(password2));
		System.out.println(passwordStrength(password3));
		System.out.println(passwordStrength(password4));
		
	}
	
	public static String passwordStrength(String password){
	    int isLower = 0;
	    int isUpper = 0;
	    int isDigit = 0;
	    int isSplChar = 0;
	    String result = "";
	    char passArray[] = password.toCharArray();
	    for(int i = 0; i<password.length();i++){
	        char ch = password.charAt(i);
	        if(ch>='a' && ch<='z')
	            isLower = 1;
	        if(ch>='A' && ch<='Z')
	            isUpper = 1;
	        if(ch>='0' && ch<='9')
	            isDigit = 1;
	        if(isSplChar(ch))
	            isSplChar = 1;
	    }
	    int sum = isLower + isUpper + isDigit + isSplChar;
	    if(sum==1){
	        result = "Weak";
	    }
	    else if(sum==2){
	        result = "Medium";
	    }
	    else if(sum==3){
	        result = "Good";
	    }
	    else if(sum==4){
	        result = "Strong";
	    }
	    return result;
	}
	
	public static boolean isSplChar(char ch){
	    char splChars[] = "!@#$%^&*()-_=+[{]};:',<.>/?".toCharArray();
	    for(int i=0;i<splChars.length;i++){
	        if(ch == splChars[i]){
	            return true;
	        }
	    }
	    return false;
	}
	
}
