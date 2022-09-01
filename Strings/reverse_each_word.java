/* :)
Aadil has been provided with a sentence in the form of a string as a function parameter.
The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
*/


public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
        
         String words[]=str.split("\\s");
        
        String rev="";
        
        for(String w:words)
        {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            rev+=sb.toString()+" ";
        }
        return rev.trim();
        
        
	}

}
