
// use cases:
//Example 1:
//
//Input: s = "the sky is blue"
//Output: "blue is sky the"

//Example 2:
//
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.

//Example 3:
//
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

package Strings.Easy.Meedium;
import java.util.*;
public class ReverseWords {
    public static String reverse(String s){
        String [] ss = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=ss.length-1; i>=0; i--){
            sb.append(ss[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = in.nextLine();

        String result = reverse(input);
        System.out.println("Reversed words: " + result);
    }
}
