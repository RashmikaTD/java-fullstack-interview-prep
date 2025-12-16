/******************************************************************************
firstOccuranceRange

Find the first occurance of all the characters in the second string in the first string 
and print the substring between the smallest and largest indexes

Example: 
String1: Zohocoporation
String2: port

Result: ohocoporat

Initialize:
  firstIndex = +∞
  lastIndex  = -∞
  StringBuilder result
  │
  ▼
For each character ch in str2:
  │
  ├─ For each character in str1:
  │     ├─ If ch == str1[j]:
  │     │     ├─ Update firstIndex = min(firstIndex, j)
  │     │     ├─ Update lastIndex  = max(lastIndex, j)
  │     │     └─ Break inner loop
  │
  ▼
After loops:
  │
  ├─ Traverse str1 from firstIndex to lastIndex
  │     └─ Append characters to result
  │
  ▼
Return result string



*******************************************************************************/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1 = s.nextLine();
        System.out.println("Enter the next string: ");
        String str2 = s.nextLine();
        System.out.println(firstOccuranceRange(str1,str2));
    }

    public static String firstOccuranceRange(String str1,String str2){
        int lastindex = Integer.MIN_VALUE;
        int firstindex = Integer.MAX_VALUE;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            for(int j=0;j<str1.length();j++){
                if(ch==str1.charAt(j)){
                    if(j<firstindex)
                        firstindex=j;
                    if(j>lastindex)
                        lastindex=j;
                    break;
                }
            }
        }
        
        for(int i = firstindex;i<=lastindex;i++){
            result.append(str1.charAt(i));
        }
        
        return result.toString();
    }
}
