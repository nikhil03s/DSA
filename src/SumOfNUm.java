import java.util.Scanner;

public class SumOfNUm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
        SumOfNUm s=new SumOfNUm();
        System.out.println(s.fact(n));
        System.out.println("Count");
        System.out.println(s.coutDig(n));
    }
    public int fact(int n)
    {
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac*=i;
        }
        return fac;
    }

    public int coutDig(int n)
    {
        int count=0;
        while (n>0)
        {
            count++;
            n/=10;
        }
        return count;
    }
}
