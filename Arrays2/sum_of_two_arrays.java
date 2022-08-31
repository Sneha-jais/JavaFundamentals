/* :)
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9
(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
Sample Input:
1
3
6 2 4
3
7 5 6
Sample Output:
1 3 8 0
*/


public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    int n=arr1.length;
    int m=arr2.length;
        int carry =0,i=n-1,j=m-1;
        int k=Math.max(m,n);
        
       while(i>=0 && j>=0){
               int sum=arr1[i]+arr2[j]+carry;
                output[k]=sum%10;
                carry=sum/10;
                k--;
                i--;
        j--;
        
        }
        
        while(i >= 0)
        {
            int sum = arr1[i] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i -= 1; 
            k -= 1;
        }
        while(j >= 0)
        {
            int sum = arr2[j] + carry; 
            output[k] = sum % 10;
            carry = sum / 10;
            j -= 1;
            k -= 1;
        }
        
        output[0]=carry;
    }

}
