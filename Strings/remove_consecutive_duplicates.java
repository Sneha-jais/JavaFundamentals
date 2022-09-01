/* :)
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx
*/


public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        int n=str.length();
        String str1=new String();
        int temp=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {   
            if(temp!=(int)str.charAt(i))
            { 
                str1+=str.charAt(i);
           
            }
            temp=(int)str.charAt(i); 
        }
        
        return str1;
	}

}
