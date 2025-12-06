import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String name= sc.nextLine();
//        String position=sc.nextLine();
//        //Concat
//        System.out.println("Your name is "+name+" and position is "+position);

        //Compare
        System.out.println("one");
        String one=sc.next();

        System.out.print("two:");
        String two=sc.next();
        System.out.println("One :"+one+" || two "+two);

        System.out.println(one.equals(two));
    }
}
