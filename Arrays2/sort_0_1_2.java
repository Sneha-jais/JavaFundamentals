/* :)
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
Sample Input:
1
7
0 1 2 0 2 0 1
Sample Output:
0 0 0 1 1 2 2 

*/


public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        
        int n=arr.length;
        int count0=0,count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                count0++;
            else if(arr[i]==1)
                count1++;
            else
                count2++;
            
        }
        int k=0;
        while(count0>0){
            arr[k++]=0;
            count0--;
        }
        
        while(count1>0){
            arr[k++]=1;
            count1--;
        }
        
        while(count2>0){
            arr[k++]=2;
            count2--;
        }
        
    }

}
