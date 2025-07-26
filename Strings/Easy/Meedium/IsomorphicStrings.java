//Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
//
//
//        Example 1:
//
//Input: s = "egg", t = "add"
//
//Output: true
//
//Explanation:
//
//The strings s and t can be made identical by:
//
//Mapping 'e' to 'a'.
//Mapping 'g' to 'd'.
//Example 2:
//
//Input: s = "foo", t = "bar"
//
//Output: false
//
//Explanation:
//
//The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
//
//Example 3:
//
//Input: s = "paper", t = "title"
//
//Output: true



package Strings.Easy.Meedium;

import java.util.*;

public class IsomorphicStrings {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String s = in.next();
        System.out.println("Enter the Second String: ");
        String t = in.next();
        if(isomorphic(s,t)){
            System.out.println("true");
        }
        else System.out.println("false");

    }
    public static boolean isomorphic(String s, String t){
        Map<Character,Integer> maps = new HashMap<>();
        Map<Character,Integer> mapt = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(!maps.containsKey(s.charAt(i))){
                maps.put(s.charAt(i),i);
            }
            if(!mapt.containsKey(t.charAt(i))){
                mapt.put(t.charAt(i),i);
            }
            if(!maps.get(s.charAt(i)).equals(mapt.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
