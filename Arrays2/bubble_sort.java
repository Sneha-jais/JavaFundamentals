/* :)
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Bubble Sort'.
*/


public class Solution {  

    public static void bubbleSort(int[] arr){
    	//Your code goes here
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        
    }  

}
