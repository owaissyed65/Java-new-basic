import java.util.Scanner;
public class userinput
{
    public static void main(String[] args)
    {
        System.out.println("Taking input from the user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        int sum = a+b;
        System.out.println(sum);

    }

}

