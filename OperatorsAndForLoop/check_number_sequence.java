/* You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn.  :)
Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing 
while the second is strictly increasing one.
for input: 5
9
8
4
5
6
output: true
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int i=0;
        for(i=0;i<n-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                break;
            }
        }
        for(int j=i+1;j<n-1;j++)
        {
            if(arr[j]>=arr[j+1])
            {
                x=1;
                break;
            }
        }
        if(x==1)
        {
            System.out.println("false");
        }
        else
        {
           System.out.println("true");
        }
	}
}
