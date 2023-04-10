public class ffindLastIndex {
    public static int index(int arr[],int idx,int n)
    {
        if(idx<0)
        {
            return -1;
        }
        if(arr[idx]==n)
        {
            return idx;
        }
        int k = index(arr, idx-1, n);
        return k;
    }
  public static void main(String[] args) {
    int arr[]={12,11,2,12,3,4};
    System.out.println(index(arr,arr.length-1,12));
  } 
}
