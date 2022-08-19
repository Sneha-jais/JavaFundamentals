/*
Write a program to input a name(as a single character) and marks of three tests as m1, m2, and m3 of a student considering all the three marks have been given in integer format.
Now, you need to calculate the average of the given marks and print it along with the name as mentioned in the output format section. :)
for input : A
	    3 4 6
output will be : A
		 4
*/

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
