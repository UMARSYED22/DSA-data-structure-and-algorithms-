import java.time.chrono.MinguoChronology;

/*Sum of digits (recursive)
Send Feedback
Write a recursive function that returns the sum of the digits of a given integer. */
public class sumOfdigit {
    public static int sum(int n){
        int sum=0;
        if(n==0)
        {
            return 0;
        }
        sum=(n%10);
        return sum(n/10)+sum;
    }
    public static void main(String[] args) {
        int n=1234;
        int res=sum(n);
        System.out.println(res);
    }
}
