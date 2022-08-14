
import java.util.Scanner;
public class Solution{



	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char ch=str.charAt(0);
        int m1,m2,m3;
        m1=s.nextInt();
          m2=s.nextInt();
          m3=s.nextInt();
        int avg=(m1+m2+m3)/3;
        System.out.println(str);
        System.out.print(avg);
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

}

}
