/* You have been given an empty array(ARR) and its size N. :) 
The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
input: 
2
9
3
output:
1 3 5 7 9 8 6 4 2
1 3 2
*/



public class Solution {
    
    public static void arrange(int[] arr, int n) {
        
    	//Your code goes here
        
           if (n%2 != 0) {
        
            arr[n/2]=n;
           }
        
        int e = 2; int o = 1; int i = 0;
        
        while (i < n/2) {
            arr[i] = o;
            o += 2;
            arr[n - i-1] = e;
            e += 2;
            i++;
        }
        
    }
}
