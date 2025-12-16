import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the mathematical expression: ");
        String input = s.nextLine();
        if(checkValidParentheses(input))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    public static boolean checkValidParentheses(String input){
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
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()!='('){
                    return false;
                }
                stack.pop();
            }
            else if(ch == '}'){
                // System.out.println("Stack: "+stack);
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()!='{'){
                    return false;
                }
                stack.pop();
            }
            else if(ch == ']'){
                // System.out.println("Stack: "+stack);
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()!='['){
                    return false;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
