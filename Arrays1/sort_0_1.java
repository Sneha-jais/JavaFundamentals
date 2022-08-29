/* :)
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. 
Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.
Input:
1
7
0 1 1 0 1 0 1
Output:
0 0 0 1 1 1 1
*/

public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[count]=0;
                count++;
            }
        }
        for(int i=count;i<n;i++){
            arr[i]=1;
        }
        
    }
}
