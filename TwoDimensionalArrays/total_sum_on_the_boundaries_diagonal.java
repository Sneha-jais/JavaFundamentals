/* :)
For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
Sample input 1:
1
3
1 2 3
4 5 6
7 8 9
Sample Output 1:
45
*/


public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
        
          int h=mat.length-1;
        if (h==-1)
        {
            System.out.println(0);
            System.exit(0);
        }


        int v=mat[0].length-1; //vertically
        int ans=0;
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                if (i==0 | j==0 | i==h | j==v |i==j | j==h-i)
                {
                    ans+=mat[i][j];
                }
            }
        }
        System.out.print(ans);
        
        
        
	}

}
