import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        //Decleration type one
//        int [] marks =new int[5];
//        marks[0]=10;
//        marks[1]=15;
//        System.out.println(marks);
//        for(int i=0;i<marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }

        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        //Input
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        //output

        for(int i=0;i<size;i++)
        {
            System.out.println("At "+i+" index  "+arr[i]);
        }
        System.out.print("Enter the target to serach the index: ");
        int target=sc.nextInt();
        for(int i=0;i<size;i++) {
            if (target == arr[i]) {
                System.out.println(i + " this is the index where this " + target + " is present");
            } else {
                System.out.println("the target value not present in array");
            }
        }
    }
}
