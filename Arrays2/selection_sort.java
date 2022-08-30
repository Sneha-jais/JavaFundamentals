/* :)
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.
*/


public class Solution {  

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        int n=arr.length;
      
        
        for(int i=0;i<n-1;i++){
            int mini=arr[i];
              int x=0;
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[j]<mini){
                    mini=arr[j];
                    flag=true;
                    x=j;
                }
            }
            if(flag==true){
            int temp=arr[i];
            arr[i]=mini;
            arr[x]=temp;
            }
            
        }
    }   

}
