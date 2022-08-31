/* :)
For a given input string(str), write a function to print all the possible substrings.
Substring: A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
Sample Input:
abc
Sample Output:
a 
ab 
abc 
b 
bc 
c 
*/


public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
        //print according to length
        int n=str.length();
        
        for(int len=1;len<=n;len++){
        
            for(int start=0;start<=n-len;start++){
               
                int end=start+len-1;
                System.out.println(str.substring(start,end+1));
            }
         
        }
        
	}

}
