/* :)
For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.
Sample Input 1:
aabccbaa
a
Sample Output 1:
bccb
*/


public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        
        String str1=new String();
        int n=str.length();
        
        int temp=(int)ch;
        
        for(int i=0;i<n;i++)
        {
            if((int)str.charAt(i)==temp)
               continue;
            str1+=str.charAt(i);

        }
        return str1;
        
        
	}

}
