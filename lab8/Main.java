
import q4.Marketing.*;
public class Main
{
    public static void main (String args[])
    {
        sales obj=new sales();
        double te=obj.earnings(45000);
        double ta=obj.tallowance(te);
        double totalearn=te+ta;
        System.out.println("Total Earnings : "+totalearn);
    }
}
