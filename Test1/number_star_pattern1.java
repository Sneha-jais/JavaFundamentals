/*  Print the following pattern for given number of rows. :)
for n=5 print
 5432*
 543*1
 54*21
 5*321
 *4321
*/

import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    System.out.print("*");
                }
                else{
                System.out.print(n-j);
                }                
            }
            System.out.println();
        }
        
	}
}
