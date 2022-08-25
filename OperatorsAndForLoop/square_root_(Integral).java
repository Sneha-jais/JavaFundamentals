/* Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4. :)
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
      Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
            if (n== 0 || n == 1)
        {
            System.out.println(n);
        }
        else
        {
            int i = 1, res = 1;
            
            while (res <= n)
            {
                i++;
                res = i * i;
            }
        
            System.out.println(i - 1);
        }
	}
}
