/*Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet*/

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char ch=str.charAt(0);
        if(ch>=97 && ch<=122)
            System.out.print("0");
        else  if(ch>=65 && ch<=90)
            System.out.print("1");
        else
             System.out.print("-1");
    }
}
