/******************************************************************************

Anagram or not

An anagram is when two strings contain the same characters with the same frequency, but in a different order.

Example - 
listen , silent -> Anagram
eat , sat -> Not Anagram

Check lengths:
  ├─ If lengths are not equal → return false (Not an Anagram)
  └─ Else continue
  │
  ▼
Initialize count[26] array to 0
  │
  ▼
For each character ch in str1:
  └─ count[ch - 'a']++
  │
  ▼
For each character ch in str2:
  └─ count[ch - 'a']--
  │
  ▼
For each element in count array:
  ├─ If any element ≠ 0 → return false (Not an Anagram)
  └─ Else continue
  │
  ▼
Return true (Anagram)


*******************************************************************************/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 string: ");
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.println(anagramOrNot(str1,str2)?"Anagram":"Not a Anagram");
    }

    public static boolean anagramOrNot(String str1,String str2){
        if(str1.length()!=str2.length()) 
            return false;
        int count[] = new int[26];
        for(int i =0;i<str1.length();i++){
            count[str1.charAt(i)-97]++;
        }
        for(int i =0;i<str2.length();i++){
            count[str2.charAt(i)-97]--;
        }
        for(int i =0;i<count.length;i++){
            if (count[i]!=0)
                return false;
        }
        return true;
    }
}
