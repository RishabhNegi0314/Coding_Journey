package Strings.Easy.Meedium;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String s){
        int i =0;
        int j = s.length()-1;
        char temp ;
        char [] chr = s.toCharArray();
        while(i<=j){
            swap(chr,i,j);
            i++;
            j--;
        }
        return new String(chr);
    }
    public static void swap(char [] chr, int x, int y){

        char t = chr[x];
        chr[x] = chr[y];
        chr[y] = t;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.next();
        System.out.println(reverse(str));

    }
}
