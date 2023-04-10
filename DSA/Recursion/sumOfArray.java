
public class sumOfArray {
    public static int sum(int arr[],int idx)
    {
        if(arr.length==idx)
        {
            return 0;
        }
        int k = sum(arr,idx+1);
        return k+arr[idx];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(sum(arr,0));
    }
    
}
