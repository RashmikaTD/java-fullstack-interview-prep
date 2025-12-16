/*
We need to check if the given expression is valid or not
Example:
(a+b)(a*b) -> Valid
(ab)(ab*) -> Invalid
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the mathematical expression: ");
	    String input = s.nextLine();
	    if(checkExp(input))
	        System.out.println("Valid");
	    else
	        System.out.println("Invalid");
}

public static boolean checkExp(String input){
	    Stack<Character> stack = new Stack<>();
	    char preCh=' ';
	    for(int i=0;i<input.length();i++){
	        char ch = input.charAt(i);
	        if(ch == '(' || ch == '{' || ch == '['){
	            stack.push(ch);
	           // System.out.println("Stack: "+stack);
	        }
	        else if(ch == ')'){
	           // System.out.println("Stack: "+stack);
	            if(stack.isEmpty())
	                return false;
	            if(preCh == '(' || preCh == '+' || preCh == '-' || preCh == '*' || preCh == '/'){
	                return false;
	            }
	            stack.pop();
	        }
	        if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
	            if(preCh == '(' || preCh == '+' || preCh == '-' || preCh == '*' || preCh == '/' || preCh == ' '){
	                return false;
	            }
	        }
	        
	        preCh=ch;
	        
	    }
	   return (stack.isEmpty() && !(preCh == '+' || preCh == '-' || preCh == '*' || preCh == '/' ));
	    
    }
	   
	
}
