import java.util.Scanner;

public class LinnerSearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the size of arry");
//        int size=s.nextInt();
//        int []arr=new int[size];
//        for(int i=0;i<size;i++)
//        {
//            System.out.println("enter the element of "+i);
//            arr[i]=s.nextInt();
//        }
//        for(int n :arr)
//        {
//            System.out.println(n);
//
//        }
        int []arr={1,5,9,6,7,8};
        int target=5;

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==target) {
                System.out.println("Target found at this index" + i);
                return;
            }
        }
        System.out.println("not found");


    }
}
