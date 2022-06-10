package q2.p2;

public class Protection2 extends q2.p1.Protection
{
    public Protection2()
    {
        System.out.println("derived other package constructor");
        //System.out.println("n = "+n);//same class or same package only
        //System.out.println("n_pri = "+n_pri);//same class only
        System.out.println("n_pro = "+n_pro);
        System.out.println("n_pub = "+n_pub);
    }
}

