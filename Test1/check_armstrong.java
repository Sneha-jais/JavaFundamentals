/* :)
Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself. for example
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
for n=103 print
false
*/


import java.util.Scanner;
public class Main {
	static int digit(int n){
        int count=0;
        while(n>0){
            int r=n%10;
            count++;
            n/=10;
        }
        return count;
        
    }
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int dig=digit(n);
        int sum=0;
        if(n==1){
            sum=n;
        }
     else{
        while(n>0){
            int r=n%10;
            sum+=Math.pow(r,dig);
            n/=10;    
        }
     }
        if(temp==sum)
            System.out.print("true");
        else
            System.out.print("false");
        
	}
}
