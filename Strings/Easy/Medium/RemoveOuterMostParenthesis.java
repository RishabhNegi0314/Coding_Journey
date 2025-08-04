package Strings.Easy.Medium;

import java.util.Scanner;

public class RemoveOuterMostParenthesis {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the parenthesis: ");
        String s = in.next();
        System.out.println("Ans: "+ outer(s));
    }
    public static String outer(String strs){
        int count = 0;
        String s =  new String();
        for(int i=0; i<strs.length(); i++){
            if(count == 0 && strs.charAt(i)=='('){
                count ++;
            }
            else if (count>0){
                if(count ==1 && strs.charAt(i) == ')'){
                    count --;
                    continue;
                }
                s = s + Character.toString(strs.charAt(i));
                if(strs.charAt(i)=='('){
                    count++;
                }
                else count --;

            }
        }
        return s;
    }
}
