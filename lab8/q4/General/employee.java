package q4.General;
public class employee
{
    protected int empid=1001;
    private String ename="Ronit";
    public double earnings(int basic)
    {
        double totalearn = basic + 0.8*basic + 0.15*basic;
        System.out.println("Empid : "+empid);
        return totalearn;
    }
}
