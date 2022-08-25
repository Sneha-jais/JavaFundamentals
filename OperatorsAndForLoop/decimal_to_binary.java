/* Given a decimal number (integer N), convert it into binary and print. :)
The binary number should be in the form of an integer.
for n=12
print 1100
*/

import java.util.Scanner;
public class Main {
    	
	public static void main(String[] args) {
		// Write your code here

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
          int[] res = new int[32];
        int i=0;
        if(n==0){
            System.out.print(0);
        }
        while(n>0){
            
           res[i]=n%2;
            n/=2;
            i+=1;
        }
     
         for (int j = i - 1; j >= 0; j--)
        {
            System.out.print(res[j]);
        }
        
	}
}
