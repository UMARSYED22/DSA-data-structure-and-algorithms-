public class nthfFibonacciNo {
    public static int fib(int n)
    {
    {
        if(n==2 || n==1)
        return 1;
    }
    int fib_1=fib(n-1);
    int fib_2=fib(n-2);
    int k= fib_1 + fib_2;
    return k;
}
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    
}
