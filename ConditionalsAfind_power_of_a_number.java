import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        
        int i=0;
        int temp=1;
        while(i<n){
            temp*=x;
            i++;
        }
        System.out.print(temp);
    }
}
