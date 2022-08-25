/*
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
for N=1234
print 4321
for N=1230
print 321
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
      Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;
        while(n>0){
            
            int r=n%10;
            rev=rev*10+r;
            n=n/10;         
            
        }
        
        System.out.print(rev);
        
	}
}

