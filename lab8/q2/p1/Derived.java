package q2.p1;

public class Derived extends Protection
{
   public Derived()
    {
        System.out.println("Derived Constructor");
        System.out.println("n = "+n);//not  possible same class only
        //System.out.println("n_pri = "+n_pri);
        System.out.println("n_pro = "+n_pro);
        System.out.println("n_pub = "+n_pub);
    }
}
