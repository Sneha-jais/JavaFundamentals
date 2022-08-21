/* Print the following pattern for n=4
   *
  ***
 *****
*******
*/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner s=new Scanner(System.in);
int n=s.nextInt();
        
        int i=1;
        while(i<=n){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space+=1;
            }
            int star=n-i+1;
            while(star<=n+i-1){
                System.out.print("*");
                star+=1;
            }
            System.out.println();
            i+=1;
        }
		
	}

}
