/* Given a binary number as an integer N, convert it into decimal and print. :)
for N=1100
print 12
*/


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
          
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0,res=0;
        while(n>0){
            int r=n%10;
            if(r==0){
                count++;
            }
            else{
                res+=Math.pow(2,count);
                count++;
            }
            n/=10;
        }
        System.out.print(res);
	}
}
