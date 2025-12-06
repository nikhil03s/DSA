public class BubbleSort {
    public static void main(String[] args) {
        int []a={5,6,13,65,26,48,31};
        int temp=0;
        System.out.println("Before Sort");
        for(int n:a)
        {
            System.out.print(n+" ");
        }

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sort");
        for(int n:a)
        {
            System.out.print(n+" ");
        }

    }
}
