/* :)
Write a program to do basic string compression.
For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
Sample Input 1:
aaabbccdsa
Sample Output 1:
a3b2c2dsa
*/

public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
        
        
         String str1=new String();
        int n = str.length();
        for (int i = 0; i < n; i++)
        {

            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
            {
                count++;
                i++;
            }
            
            str1+=str.charAt(i);
            if(count>1)
            {
                str1+=count;
            }
        }
        return str1;
        
        
	}

}
