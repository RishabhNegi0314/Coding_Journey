//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.


package Strings.Easy.Medium;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static String lcp(String [] strs){
        int n = strs.length;
        int i = 0;
        String prefix = "";
        while(true){
            char ch = strs[0].charAt(i);
            boolean flag = true;
            for(int j = 1; j< n; j++){
                if(i<strs[j].length() && strs[j].charAt(i)==ch){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                prefix = prefix + Character.toString(ch);
                i++;
            }
            else {
                break;
            }
        }
        return prefix;

    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of string array: ");
        int n =in.nextInt();
        System.out.println("Enter the String array: ");
        String [] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = in.next();
        }
        System.out.println("The longest Common Prefix is: "+ lcp(str));
    }
}
