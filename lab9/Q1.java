import java.util.*;

public class Q1
{  
    public static void main(String arg[])
    {  
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
            c=a/b;
            System.out.println("Result : "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : "+ e);
        }
        System.out.println("END");
    }
}
