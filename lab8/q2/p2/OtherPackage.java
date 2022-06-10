package q2.p2;

public class OtherPackage
{
    public OtherPackage()
    {
        q2.p1.Protection p=new q2.p1.Protection();
        System.out.println("other package constructor");
        //System.out.println("n = "+p.n);//same class or same package only
        //System.out.println("n_pri = "+n_pri);//same class only
        //System.out.println("n_pro = "+p.n_pro);//class, subclass or package only
        System.out.println("n_pub = "+p.n_pub);
    }
}

