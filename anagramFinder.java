/******************************************************************************

Anagram or not

An anagram is when two strings contain the same characters with the same frequency, but in a different order.

Example - 
Array [check,mat,pat,got,tiger,eat,tea,tap]
Word ate

Ans -> eat, tea

Call anagramFinder(arr, word)
  │
  ▼
Inside anagramFinder:
  ├─ Initialize empty result ArrayList
  │
  ▼
  Loop j = 0 to arr.length-1
      ├─ flag = 0
      ├─ Initialize count[58] array to 0
      ├─ Check length:
      │      ├─ If arr[j].length != word.length → continue next j
      │      └─ Else continue
      │
      ▼
      Loop i = 0 to word.length-1
          └─ count[word.charAt(i) - 'A']++
      ▼
      Loop i = 0 to arr[j].length-1
          └─ count[arr[j].charAt(i) - 'A']--
      ▼
      Loop i = 0 to count.length-1
          ├─ If count[i] != 0 → flag = 1
      ▼
      If flag == 0
          └─ Add arr[j] to result
  ▼
Convert result ArrayList to String[] and return
  │
  ▼
Back in main:
  └─ Loop over result array and print each word


*******************************************************************************/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i+1) + ":");
            arr[i] = sc.nextLine();
        }
        System.out.println("Enter the word:");
        String word = sc.nextLine();
        String[] result = anagramFinder(arr, word);
        System.out.println("The words are:");
        for(String r : result){
            System.out.println(r);
        }
    }

    public static String[] anagramFinder(String arr[], String word){
        
        int flag = 0;
        ArrayList<String> result = new ArrayList<String>();
        for(int j=0; j<arr.length;j++){
            flag=0;
            int count[] = new int[58];
            if (arr[j].length() != word.length())
                continue;
            for(int i=0; i<word.length(); i++){
               
                count[word.charAt(i) -'A']++;
            }
            for(int i=0; i<arr[j].length(); i++){
                
                count[arr[j].charAt(i) -'A']--;
            }
            for(int i=0;i<count.length;i++){
                
                if (count[i]!=0){
                    
                    flag=1;
                    
                }
                
            }
            
            if (flag==0)
                result.add(arr[j]);
        }
        return result.toArray(new String[result.size()]);
    }
}
