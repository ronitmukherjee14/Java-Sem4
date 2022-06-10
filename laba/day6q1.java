public class day6q1 {
    public static void main (String args[])
    {
        int a[] = new int[5];
        try{
            a[4]=7;
            a[5]=30/0;

        }
        catch(ArrayIndexOutOfBoundsException e1195)
        {
            System.out.println(e1195);
        }
        catch (Exception e1195)
        {
            System.out.println(e1195);
        }
        finally {
            System.out.println("finally block executed.");

        }
        System.out.println("a[4] = "+a[4]);
    }

}
