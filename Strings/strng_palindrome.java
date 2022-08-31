/* :)
Given a string, determine if it is a palindrome, considering only alphanumeric characters.
Palindrome: A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
Sample Input:
abcdcba
Sample Output:
true 
*/


public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
        int i=0;
        int j=str.length()-1;
        
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
        
        else{
            i++;
            j--;
              }
        }
         return true;
        
	}

}
