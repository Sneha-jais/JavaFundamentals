/*  Write a program to print first x terms of the series 3N + 2 which are not multiples of 4. :)
for n=10, print
5 11 14 17 23 26 29 35 38 41
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int temp;
        for(int i=1;i<=x;i++){
            temp=3*i+2;
            if(temp%4==0){
            x+=1;
                continue;
            }
            System.out.print(temp+" ");
        }
        

	}
}
