//Number of Digits
// Send Feedback
// Given the number 'n', find out and return the number of digits present in a number .
public class numberOfDigits {
    public static int digit(int n)
    {
        // int count=0;
        
        // if(n==0)
        // {
        //     return 0;
        // }
        if(n==0)
        {
            return 0;
        }
       int  count=digit(n/10);
        return count+1;
    }

    public static void main(String[] args) {
        System.out.println(digit(0));
    }
}
