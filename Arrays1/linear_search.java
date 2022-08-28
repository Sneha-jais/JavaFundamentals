/*  :)
Input:
2
7
2 13 4 1 3 6 28
9
5
7 8 5 9 5      
5
output:
-1
2
*/

public class Solution {

    public static int linearSearch(int arr[], int x) {
	//Your code goes here
    
        int n=arr.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ans=i;
                break;
            }
        }
    return ans;
    
    }
}

