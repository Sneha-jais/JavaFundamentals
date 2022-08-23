/* Write a program to print triangle of user defined integers sum. :)
for n=5
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
*/


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int i=1;
        while(i<=n){
            
            int j=1;
            while(j<i){
                System.out.print(j+"+");
                j+=1;
            }
            if(j==i){
                System.out.print(j+"=");            
            }
            int temp=i*(i+1)/2;
            System.out.print(temp);
               
            System.out.println();
            i+=1;
            
        }
        
	}
}
