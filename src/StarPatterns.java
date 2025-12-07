import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StarPatterns star=new StarPatterns();
        int n= sc.nextInt();
        star.Rectangle(n);
        System.out.println("=====================");
        star.hollowRec(n);
        System.out.println("=====================");
        star.halfPyramid(n);
        System.out.println("=====================");
        star.invertedHalf(n);
        System.out.println("=====================");
        star.numPyramid(n);
        System.out.println("=====================");
    }

    public void Rectangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=5;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public void hollowRec(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1 || i==n || j==1 || j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void halfPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public void invertedHalf(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void numPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
                if(j==1 || j==n)
                    System.out.printgi(j);
                else
                    System.out.print(j*2);
            System.out.println();
        }
    }

}
