public class Patterms {
    public static void main(String[] args) {
        Patterms p=new Patterms();
        p.p1(4);
        System.out.println();
        p.p2(4);
        System.out.println();
        p.p3(4);
        System.out.println();
        p.p4(4);
    }
    public void p1(int a)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void p2(int a)
    {
        for(int i=0;i<=a;i++)
        {
            for (int j=0;j<=a;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void p3(int a)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=i;j<=a;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void p4(int a)
    {
        for(int i=1;i<=a;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
