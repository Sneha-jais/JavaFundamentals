/* Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.  :)
input:
1
3
9 8 9
output:
26
*/


public class Solution {
	
	public static int sum(int[] arr) {
		//Your code goes here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
	}
}
