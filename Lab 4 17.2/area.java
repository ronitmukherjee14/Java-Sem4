import java.util.*;
class area
{
    void findarea(int a, int b)
    {
       System.out.println( "\n Area of rectangle with breadth "+a+" and length " +b+ " is :" + a*b);
    }
  
    void findarea(int a)
    {
        System.out.println( "\n Area of circle with radius " +a+ " is :" + 3.14 * a);
    }
  
    void findarea(int a, int b, int c)
    {
        double temp = (a + b + c);
        double s= temp/2;
        double triarea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println( "\n Area of triangle with length of sides  "+a+"," +b+ " and " +c+" is : "+ triarea);
    }
    public static void main(String args[])
    {
        area d = new area();
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Find area of \n 1 . Rectangle \n 2 . Triangle \n 3 . Circle \n\nSelect a choice : ");
        int choice =sc.nextInt();
        switch(choice)
        {
        case 1:
            System.out.print("\n Enter the breadth : ");
            int a =sc.nextInt();
            System.out.print("\n Enter the length : ");
            int b=sc.nextInt();
            d.findarea(a,b);
            break;
        case 2:
            System.out.print("\n Enter the length of first side : ");
            int x =sc.nextInt();
            System.out.print("\n Enter the length of second side : ");
            int y=sc.nextInt();
            System.out.print("\n Enter the length of third side : ");
            int z =sc.nextInt();
            d.findarea(x,y,z);
            break;
        case 3:
            System.out.print("\n Enter the radius : ");
            int r =sc.nextInt();
            d.findarea(r);
            break;
        default:
            System.out.println("Invalid choice");
        }
 
   }
}
