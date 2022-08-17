import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int dig;
        int sume=0,sumo=0;
        while(n>0){
            dig=n%10;
            if(dig%2==0){
                sume+=dig;
            }
            else{
                sumo+=dig;
        }
        n=n/10;
        
        }
        
System.out.print(sume+" ");
System.out.print(sumo);
	}
}
