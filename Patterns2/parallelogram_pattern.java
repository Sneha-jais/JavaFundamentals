/* Write a program to print parallelogram pattern for the given N number of rows. :)
for n=4

****
 ****
  ****
   ****    

*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int i=1;
        while(i<=n){
            int space=0;
            while(space<i-1){
              System.out.print(" ");
                space+=1;

            }
            
            int star=1;
            while(star<=n){
                System.out.print("*");
                star+=1;

                
            }
            System.out.println();
            i+=1;
        }
	}
}
