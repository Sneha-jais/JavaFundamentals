/* Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false. :)
  for n=5
    print true
 */


import java.util.Scanner;
public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
        int a=0;
        int b=1;
        int c=1;
        boolean flag=false;
        if(n==a || n==b){
            flag=true;
        }
        while(c<=n){
            c=a+b;
            a=b;
            b=c;
            if(c==n){
                flag=true;
                break;
            }
        }
        return flag;    
    
    }
        public static void main(){
            
         Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            System.out.print(checkMember(n));
        
        
        
	}
	

}
