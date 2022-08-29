/*  :)
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, 
there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
input:
1
9
0 7 2 5 4 7 1 3 6
output:
7
*/


public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int n=arr.length;
           for (int i = 0; i <n; i++) 
        {
            int temp=-1;
            for (int j = i+1; j <n; j++) 
            {
                    if (arr[i]==arr[j])
                    {
                        temp++;
                    }
            }
            if (temp==0)
            {
                return arr[i];
            }
                    
            
        }
        return arr[0];
    }
}
