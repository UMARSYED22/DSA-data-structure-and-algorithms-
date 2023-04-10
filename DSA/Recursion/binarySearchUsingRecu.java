

public class binarySearchUsingRecu {
    public static int binarySearch(int arr[],int si,int ei,int x)
    {
        if(si>ei)
        {
            return -1;
        }
        int mid=(si+ei)/2;
        if(arr[mid]<x)
        {
            si=mid+1;
            binarySearch(arr, si, ei, x);
        }
        else if(arr[mid]>x){
            ei=mid-1;
            binarySearch(arr, si, ei, x);
            
        }
        return mid;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,4,5,8,9};
        System.out.println(binarySearch(arr,0,arr.length,8));
    }
}
