public class Selection {
    public static void main(String[] args) {
        int []a={5,6,2,3,1};
        int temp=0;
        int minIndex=-1;
        System.out.println("Before Sort");
        for(int n:a)
        {
            System.out.print(n+" ");
        }

        for(int i=0;i<a.length-1;i++)
        {
            minIndex=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[minIndex]>a[j])
                {
                    minIndex=j;
                }

            }
            temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;

            System.out.println("After Sort");
            for(int n:a)
            {
                System.out.print(n+" ");
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
