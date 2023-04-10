public class factorial{
    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;   //base case
        }
        int samllOutput=fact(n-1);// assumption
        return samllOutput*n;//small step

    }
public static void main(String[] args) {
    System.out.println(fact(5));
    
}
}