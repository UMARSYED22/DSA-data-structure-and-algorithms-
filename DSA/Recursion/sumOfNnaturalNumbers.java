public class sumOfNnaturalNumbers {
    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;

        }
        int assumption=sum(n-1);
        return assumption+n;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
