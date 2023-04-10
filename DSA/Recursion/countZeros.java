/*Given an integer N, count and return the number of zeros that are present in the given integer using recursion. */
import java.util.Scanner;
public class countZeros {
    public static int zero(int input)
    {
        
            // Write your code here
            if(input==0)
            {
                return 1;
            }
            return count(input);
        }
        public static int count(int input)
        {
            if(input==0)
            {
                return 0;
            }
            if(input%10==0)
            {
                return 1+count(input/10);
            }
            else{
                return count(input/10);
            }
        // if(n/10==0){
		// 	if(n%10==0){
		// 		return 1;
		// 	}else{
		// 		return 0;
		// 	}
		// }
		
		// int count=0;
		// if(n%10==0){
		// 	count++;
		// 	return count=count+zero(n/10);
		// }else{
		// 	count=count+zero(n/10); //it will work for numbers not having zero in end
		// return count;
		// }
	} 
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        // int n=00010204;
        
        System.out.println(zero(n));
    }
    
}
