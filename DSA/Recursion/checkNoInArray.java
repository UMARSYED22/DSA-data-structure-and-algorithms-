public class checkNoInArray {
    public static int check(int arr[],int idx,int n)
    {
        if(arr.length==idx)
        {
            return 0;
        }
        if(arr[idx]==n)
        {
            return idx;
        }
        int small=check(arr, idx+1,5);
        return small;
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,7};
        System.out.println( check(arr,0,5));
    }
}
