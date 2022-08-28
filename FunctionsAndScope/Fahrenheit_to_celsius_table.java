/*   :)
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start to End at the gap of W, 
into their corresponding Celsius values and print the table.
input:
0 
100 
20
Output:
0   -17
20  -6
40  4
60  15
80  26
100 37
*/


import java.util.Scanner;
public class Solution {

	public static void printFahrenheitTable(int s, int e, int w) {
        
         int f=0;
        while(s<=e){
 
            f=((5*(s-32))/9);
             System.out.println(s+" "+f);
            s+=w;
            
        }
    }
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
        
        
        public static void main(){
            
		Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
            
            printFahrenheitTable(s,e,w);
       
        
	}
}
