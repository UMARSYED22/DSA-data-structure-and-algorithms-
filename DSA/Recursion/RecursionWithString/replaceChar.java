// package RecursionWithString;

public class replaceChar {
    public static void main(String[] args) {
        String s="abxcxdx";
        char a='x',b='y';
        System.out.println(replace(s,a,b));
    }
    public static String replace(String s,char a,char b)
    {
        if(s.length()==0)
        {
            return s;
        }
        String small=replace(s.substring(1), a, b);
        if(s.charAt(0)==a)
        {
            return b+small;
        }
        else{
            return s.charAt(0)+small;
        }
    }
    
}
