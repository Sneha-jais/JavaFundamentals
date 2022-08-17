
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
    Scanner s=new Scanner(System.in);
   double sal=s.nextInt();
    String grade=s.next();
    char ch=grade.charAt(0);
    double hra=sal/5;
    double da=sal/2;
    double allow;
    if(ch=='A')
    	allow=1700;
    else if(ch=='B')
    	allow=1500;
    else
    	allow=1300;
    
    double pf=(sal*11)/100;
    
    double salary=(sal+hra+da+allow-pf);
    
    System.out.print(Math.round(salary));
    
	}

}
