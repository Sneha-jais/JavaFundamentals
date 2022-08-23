/* 0,1,1,2,3,5,8...
for n=6 :)
print "8"
*/
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int a=1;
        int b=1;
        int c=a+b;
        
        if(n==0){
            System.out.print(0);
            return;
        }
        if(n==1){
            System.out.print(a);
            return;
        }
        else if(n==2){
            System.out.print(b);
            return;
        }
        else{
            n-=2;
        }
        
        while(n>0){
            c=a+b;
            a=b;
            b=c;     
            n-=1;
        }

		 System.out.print(c);
	}

}
