/* :)
You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)
Sample Input:
1
7
2 13 4 1 3 6 28
Sample Output:
13
*/

public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int n=arr.length;
        if(n<=1){
            return Integer.MIN_VALUE;
        }
        
        int larg= Math.max(arr[0],arr[1]);
        int secl=Math.min(arr[0],arr[1]);
        boolean flag=false;
        for(int i=2;i<n;i++){
            if(arr[i]>larg){
                secl=larg;
                larg=arr[i];
                flag=true;
            }
            else if(arr[i]>secl && arr[i]<larg){
                secl=arr[i];
            }
        }
        
        
        if(flag==true)
        return secl;
        else
            return Integer.MIN_VALUE;
    }

}
