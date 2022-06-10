class Test 
{
        void method()
    {
        System.out.println("Namaste!");
    }
}
  
public class Q4 extends Test 
{
    void method()
    {
        System.out.println("Namaste! Ronit");
    }
    public static void main(String args[])
    {
        Q4 b = new Q4();
        b.method();
    }
}
