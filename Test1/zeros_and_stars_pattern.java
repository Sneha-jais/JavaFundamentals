/* Print the following pattern
for n=4
*000*000*
0*00*00*0
00*0*0*00
000***000
*/

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<(2*n)+1;j++){
                if(i==j || (i+j)==2*n || j==n){
						System.out.print("*");
                }
                else{
System.out.print("0");
                }
            }
            System.out.println();
            
        }
        
	}	


}


