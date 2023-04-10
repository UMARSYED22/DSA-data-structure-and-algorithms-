// package RecursionWithString;

public class counteros {
    public static int zero(int n)
    {
        if(n/10==0)
        {
            if(n%10==0)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
        int count=0;
        if(n%10==0)
        {
            count++;
            return count=count+zero(n/10);

        }
        else{
            count=count+zero(n/10);
            return count;
        }
    }
    public static void main(String[] args) {
        int n=001024;
        System.out.println(zero(n));
    }
    
}
