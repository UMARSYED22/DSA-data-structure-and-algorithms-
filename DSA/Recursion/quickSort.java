public class quickSort {
    public static int partition(int a[],int si,int ei)
    {
        int pivot=a[si];
        int count=0;
        for(int i =si+1;i<=ei;i++)
        {
            if(a[i]<pivot)
            {
                count++;
            }
        }
        int temp=a[si+count];
        a[si+count]=pivot;
        a[si]=temp;
        int i=si;
        int j=ei;
        while(i<j)
        {
            if(a[i]<pivot)
            {
                i++;
            }
            else if(a[j]>=pivot)
            {
                j--;

            }
            else{
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return si+count;
    }
public static void quickSort(int a[],int si,int ei){
  {
      if(si>=ei)
      {
          return;
      }
      int pivotIndex=partition(a, si, ei);
      quickSort(a, si, pivotIndex-1);
      quickSort(a, pivotIndex+1, ei);
  }
}

    // public static int partition(int arr[],int si,int ei)
    // {
    //     int pivot=arr[si];
    //     int count=0;
    //     for(int i=si+1;i<=ei;i++)
    //     {
    //         if(arr[i]<pivot)
    //         {
    //             count++;
    //         }
    //     }
    //     int temp=arr[si+count];
    //     arr[si+count]=pivot;
    //     arr[si]=temp;
    //     int i=si;
    //     int j=ei;
    //     while(i<j)
    //     {
    //         if(arr[i]<pivot)
    //         {
    //             i++;
    //         }
    //         else if(arr[j]>=pivot)
    //         {
    //             j--;
    //         }
    //         else{
    //             temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //             i++;
    //             j--;
    //         }
           
    //     }
    //     return si+count;
    // }
    // public static void quickSort(int arr[],int si,int ei)
    // {
    //     if(si>=ei)
    //     {
    //         return;
    //     }
    //     int pivotIndex=partition(arr,si,ei);
    //     quickSort(arr, si, pivotIndex-1);
    //     quickSort(arr, pivotIndex+1, ei);
    // }
    public static void main(String[] args) {
        int arr[]={6,2,4,5,3,1};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
