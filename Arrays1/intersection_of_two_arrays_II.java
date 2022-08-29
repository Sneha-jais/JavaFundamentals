/*
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively.
You need to print their intersection; An intersection for this problem can be defined 
when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
Input:
2
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10
Output:
2 4 3
10
*/

public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int n=arr1.length;
        int m=arr2.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=-1;
                    break;
                }
            }
        }
        
        
    }
}
