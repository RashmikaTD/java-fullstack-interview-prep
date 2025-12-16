/******************************************************************************
removeUnbalanceParentheses
Example: ((((ab)) -> ((ab))
((a*b)((c*d)) -> (a*b)((c*d))

Initialize:
  Stack for '(' indexes
  HashSet for indexes to remove
  │
  ▼
For each character in the string:
  ├─ If '(' → push index onto Stack
  ├─ If ')' →
  │     ├─ If Stack not empty → pop (matched '(')
  │     └─ Else → add index to HashSet (unmatched ')')
  │
  ▼
After traversal:
  While Stack not empty → pop remaining '(' indexes and add to HashSet
  │
  ▼
Build final string using StringBuilder:
  ├─ For each character:
  │     └─ If index not in HashSet → append to StringBuilder



*******************************************************************************/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String input = s.nextLine();
        System.out.println(removeUnbalanceParentheses(input));
    }

    public static String removeUnbalanceParentheses(String input){
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> index = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        char preCh=' ';
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(i);
                
                
            }
            else if(ch == ')'){
                
                if(stack.isEmpty()){
                    index.add(i);
                }
                stack.pop();
            }
        }
        
        while(!stack.isEmpty()){
            index.add(stack.pop());
        }
        
        for (int i=0;i<input.length();i++) {
            if(!index.contains(i))
                sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
