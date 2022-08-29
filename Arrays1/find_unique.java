/* You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1]. :)
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
input:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
output:
4
10
*/

public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
        int n=arr.length;
          for (int i = 0; i <n; i++) 
        {
            int count=-1;
              
            for (int j = 0; j <n; j++) 
            {
                    if (arr[i]==arr[j])
                    {
                        count++;
                    }
            }
            if (count==0)
            {
                return arr[i];
            }
                    
            
        }
        return arr[0];
    }
}
