/* :)
For a given two-dimensional integer array/list of size (N x M),
you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
Sample Input 1 :
1
2 2 
1 1 
1 1
Sample Output 1 :
row 0 2
*/


public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
        
        //Your code goes here
        int rl=Integer.MIN_VALUE;
        int cl=Integer.MIN_VALUE;
        int ci=0;
        int ri=0;

        if (mat.length>0)
        {
            for (int i = 0; i < mat.length; i++)
            {
                int sum=0;
                for(int ele:mat[i])
                    sum+=ele;
                if (rl<sum)
                {
                    rl = sum;
                    ri=i;
                }
            }
            
            for (int i = 0; i < mat[0].length; i++)
            {
                int sum=0;
                for (int j = 0; j < mat.length; j++)
                {
                    sum+=mat[j][i];
                }
                if (cl<sum)
                {
                    cl = sum;
                    ci=i;
                }
            }
        }
        if (rl>=cl)
            System.out.println("row "+ri+" "+rl);
        else
            System.out.println("column "+ci+" "+cl);
        
	}

}
