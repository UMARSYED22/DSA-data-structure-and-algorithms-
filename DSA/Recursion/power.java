public class power {
    public static int power(int n,int m)
    {
        if(m==0)
        {
            return 1;
        }
        int assumption=power(n,m-1);
        return assumption*n;
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    
}
