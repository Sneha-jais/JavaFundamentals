/* Print the following pattern for n=4 :)
   1 // 3 spaces
  12 // 2 spaces
 123 // 1 spaces
1234 // 0 spaces
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
         int k=1;
         int space=1;
         while(space<=n-i){
            System.out.print(" ");
            space+=1;
          }
          int star=1;
          while(star<=i){
             System.out.print(k);
             k+=1;
            star+=1;
           }

         System.out.println();
          i+=1;
        }
    }
}
