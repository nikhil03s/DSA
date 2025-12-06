import java.util.Scanner;

public class StringLen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int max=5;
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            str.charAt(i);
            count++;
        }
        if(count<max )
            System.out.println("less then 5");
        if (count>max)
            System.out.println("greater then 5");
        if (count==max)
            System.out.println("equal");
    }
}
