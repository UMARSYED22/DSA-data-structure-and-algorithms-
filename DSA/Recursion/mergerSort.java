public class mergerSort {
    public static void merge(int a[],int b[],int c[])
    {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
            while(i<a.length)
            {
                c[k]=a[i];
                i++;
                k++;
            }
            while(j<b.length)
            {
                c[k]=b[j];
                j++;
                k++;
            }
            

        

    }
    public static void mergeSort(int input[])
    {
        if(input.length<=1)
        {
            return;
        }
        int a[]=new int[input.length/2];
        int b[]=new int[input.length-a.length];
        for(int i=0;i<input.length/2;i++)
        {
            a[i]=input[i];
        }
        for(int i=input.length/2;i<input.length;i++)
        {
            b[i-input.length/2]=input[i];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,input);
    }
       
    
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,0};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
    
    



