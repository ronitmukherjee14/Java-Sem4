import java.util.UUID;
import java.io.*;
 
class null_exec
{

    private static Singleton single = null;
    private String ID = null;
 
    private Singleton()
    {
    
        ID = UUID.randomUUID().toString();
    }
 
    public static Singleton getInstance()
    {
        if (single == null)
            single = new Singleton();
        return single;
    }
 
    public String getID()
    {
        return this.ID;
    }
}
 
// Driver Code
public class TestSingleton
{
    public static void main(String[] args)
    {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getID());
    }
}
