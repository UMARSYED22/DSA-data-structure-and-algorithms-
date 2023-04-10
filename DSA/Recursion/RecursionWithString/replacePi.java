
public class replacePi {
public static String replacepi(String s){
    if(s.length()<=1)
    {
        return s;
    }
   if(s.charAt(0)=='p' && s.charAt(1)=='i')
   {
    //we call recurion on (n-2)
    String small=replacepi(s.substring(2));
    return 3.14+small;
   }
   else{
    // we call recursion on n-1
    String small=replacepi(s.substring(1));
    return s.charAt(0)+small;
   }
}

    public static void main(String[] args) {
        System.out.println(replacepi("pibsc"));
    }
}
