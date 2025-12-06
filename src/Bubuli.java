public class Bubuli {
    public static void main(String[] args) {
        int []arr={5,2,3,4,1};
        Bubuli sorts=new Bubuli();
       // sorts.bubble(arr);
        sorts.selection(arr);

    }
    public void bubble(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public void selection(int []arr)
    {
        int minindex=-1;
        for(int i=0;i<arr.length;i++)
        {
            minindex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minindex]>arr[j])
                {
                    minindex=j;
                }
            }
            int temps=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temps;
        }
        for(int n:arr)
        {
            System.out.println(n);
        }
    }
}
