import java.util.*;
public class HelpfulMaths {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String [] str = s.split("\\+");
        Arrays.sort(str);
        String res = "";
        for(int i=0; i<str.length-1; i++){
            res = res+ str[i] + "+";
        }
        System.out.println(res+=str[str.length-1]);
    }
}
