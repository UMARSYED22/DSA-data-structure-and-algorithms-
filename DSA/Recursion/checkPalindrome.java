

/*Check Palindrome (recursive)
Send Feedback
Check whether a given String S is a palindrome using recursion. Return true or false. */
public class checkPalindrome {

    public static boolean check(String s,int si,int ei){
        if(si>ei)
        {
            return true;
        }
        if(s.charAt(si)!= s.charAt(ei))
        {
            return false;
        }
        else{
           return  check(s,si+1,ei-1);
        }
      
    }
    public static void main(String[] args) {
        String str="abbabb";
        boolean res=check(str,0,str.length()-1);
        System.out.println(res);
    }
}
