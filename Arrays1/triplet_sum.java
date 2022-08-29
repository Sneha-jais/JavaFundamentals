/* :)
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
input:
1
7
1 2 3 4 5 6 7 
12
output:
5
*/


public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int count=0;
        int n=arr.length;
        
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x)
                        count++;
                }
            }
        }
        return count;
        
    }

}
