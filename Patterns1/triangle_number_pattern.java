/* Print the following pattern for n=4 :)
1
22
333
4444*/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner s= new Scanner(System.in);
int n=s.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i);
                j+=1;
            }
            System.out.println();
            i+=1;
        }
		
	}

}


