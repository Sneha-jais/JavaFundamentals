/* :)
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.
*/


public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0,j=0,k=0;
        int arr3[];
        arr3= new int[n1+n2];
        
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else if(arr1[i]>arr2[j]){
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        
        while(i<n1){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
         while(j<n2){
            arr3[k]=arr2[j];
            k++;
            j++;
        }
    
        return arr3;
    }
    

}
