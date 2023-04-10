import javax.sql.rowset.spi.SyncResolver;

/*Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed. */
public class multiplication {
    public static int multi(int n,int m)
    {
        int mul=n;
        if(m==0)
        {
            return 0;
        }
        return mul+multi(n, m-1);
    }
    public static void main(String[] args) {
        int n=3;
        int m=5;
        int res= multi(n,m);
        System.out.println(res);
    }
        
    
}
