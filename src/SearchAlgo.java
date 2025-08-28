import java.util.Scanner;

public class SearchAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arry:");
        int size=sc.nextInt();
        int [] a=new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the "+ i+"of element:");
            a[i]=sc.nextInt();
        }
        System.out.println("The Array:");
        for(int n: a)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.print("Enter the element to find the index:");
        int target =sc.nextInt();

        int res=binarySearch(a,target);
        if(res!=-1)
        {
            System.out.println("Element Found at index of :"+res);
        }else
            System.out.println("Element not found");

    }
    public static int linerarSearch(int []a,int target)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                return i;
            }
        }

        return -1;

    }

    public static int binarySearch(int []a,int target)
    {
        int left=0;
        int right=a.length-1;

        while(left<=right)
        {
            int mid=(left+right)/2;
            if(a[mid]==target)
            {
                return mid;
            } else if (a[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}
