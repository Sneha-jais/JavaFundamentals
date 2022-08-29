/* :)
You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
Input:
1
9
1 3 6 2 5 4 3 2 4
7
Output:
7
*/
public class Solution {  

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
        
    }
}
