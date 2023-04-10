public class towerOfHanoi {
    public static void tower(int n,char s,char a,char d)
    {
        if(n==1)
        {
            System.out.println("move first disk from "+s+" to "+d);
            return;
        }
        tower(n-1, s, d, a);
        System.out.println("move "+n+"th disk from "+s+" to "+a);
        tower(n-1,a,s,d);
    }
    public static void main(String[] args) {
        tower(3,'s','a','d');
    }
}
