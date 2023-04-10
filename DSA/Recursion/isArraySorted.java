public class isArraySorted{
    public static boolean check(int arr[])
    {
        if(arr.length==1)//base case
        {
            return true;
        }
        if(arr[0]>arr[1])
        {
            return false;
        }
        int smallArray[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            smallArray[i-1]=arr[i];

        }
        boolean isSmallArraySorted=check(smallArray);//hypothesis
        return isSmallArraySorted;//small step

    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0};
        System.out.println(check(arr));
    }
}