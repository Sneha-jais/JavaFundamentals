/*n  :)
Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
 
*/

import java.util.Scanner;
public class Main {
    
    
	static int fact(int n) {
        if(n==1)
            return 1;
        return n*fact(n-1);
  
    }
    
	public static void main(String[] args) {
		// Write your code here
			Scanner s=new Scanner(System.in);
            int n=s.nextInt();
           int ch=s.nextInt();
        int res=-1;
        if(ch==1){
            res=n*(n+1)/2;
            
        }
        else if(ch==2){
            res=fact(n);
        }
        
        System.out.print(res);
        
	}
}
