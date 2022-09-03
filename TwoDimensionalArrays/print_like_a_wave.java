/* :)
For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, 
i.e, print the first column top to bottom, next column bottom to top and so on.
Sample Input 1:
1
3 4 
1  2  3  4 
5  6  7  8 
9 10 11 12
Sample Output 1:
1 5 9 10 6 2 3 7 11 12 8 4
*/


public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
        int n=mat.length;
        
           if (n==0)
            System.exit(0);
        
        int p=n-1;
        
        for (int j = 0; j < mat[0].length ; j++)
        {
            for (int i = 0; i < n; i++)
            {
                System.out.print(mat[i][j]+" ");
            }
            j++;
            if (j==mat[0].length)
                System.exit(0);
            for (int i = n-1; i >= 0; i--)
            {
                System.out.print(mat[i][j]+" ");
            }
        }
        
        
	}

}
