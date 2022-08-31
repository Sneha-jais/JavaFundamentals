/* :)
You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
Sample Input:
1
7
1 2 3 4 5 6 7
2
Sample Output:
3 4 5 6 7 1 2
*/


public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n=arr.length,k=0;
      int[] temp=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
    
        for(int i=n-d;i<n;i++)
        {
            arr[i]=temp[k];
            k++;
        }
        
    }

}
