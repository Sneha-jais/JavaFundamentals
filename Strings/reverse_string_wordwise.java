/*
Reverse the given string word wise.
That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Sample Input:
Always indent your code
Sample Output:
code your indent Always
*/

public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        
          String[] arr1=input.split(" ");
        String rev="";
        
        for (int i = arr1.length-1;i >=0 ; i--)
        {
            rev+=arr1[i]+" ";
        }
        return rev;
       
	}
}
