/* :)
For a given a string(str), find and return the highest occurring character.
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
*/


public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
	
    
        int count[] = new int[256];

        int n = str.length();
        
        for (int i=0; i<n; i++){
            
            count[str.charAt(i)]++;
         
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i <n; i++)
        {
            if (max < count[str.charAt(i)])
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
            
        }
    
    return result;
    }

}
