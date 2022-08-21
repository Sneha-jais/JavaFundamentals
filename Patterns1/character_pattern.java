/* Print the following pattern for n=4 :)
A
BC
CDE
DEFG
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
            char p=(char)('A'+i-1);
            int j=1;
            
            while(j<=i){
                System.out.print(p);
                p=(char)(p+1);
            j+=1;    
            }
            i+=1;
            System.out.println();
        }
		
	}

}
