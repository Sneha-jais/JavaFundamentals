/* You have been given an array/list(ARR) of size N. :)
You need to swap every pair of alternate elements in the array/list.
You don't need to print or return anything, just change in the input array itself.
input:
2
9
9 3 6 12 4 32 5 11 19
4
1 2 3 4
output:
3 9 12 6 32 4 11 5 19 
2 1 4 3 
*/


public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int n=arr.length;
        int x=0;
        if(n%2==0){
            x=n;
        }
        else{
            x=n-1;
        }
        for(int i=0;i<x;i+=2){
           int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
       
    }
}
