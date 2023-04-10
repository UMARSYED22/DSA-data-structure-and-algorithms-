/*Staircase
Send Feedback
A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W. */
public class stairCase {
    public static int get(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            return 0;
        }
        else{
            int k=get(n-1)+get(n-2)+get(n-3);
            return k;
        }
        
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(get(n));
    }
}
