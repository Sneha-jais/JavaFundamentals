/*
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Constraints :
1 <= x <= 30
0 <= n <= 30
Sample Input 1 :
 3 4
Sample Output 1 :
81
*/

import java.util.Scanner;

public class Main
{
    public static int power(int x, int n){
        
        if(n==0)
            return 1;
        
        int temp=power(x,n/2);
        
        if(n%2==0){
            return temp*temp;
        }
        else{
            return x*temp*temp;
        }
        
    }
    
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int n=sc.nextInt();
	
	System.out.println(power(x,n));
	
	}
}
