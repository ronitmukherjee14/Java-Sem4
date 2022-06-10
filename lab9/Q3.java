public class Q3
{  
    public static void main(String arg[])
    {  
        String s=null;
        try
        {
            System.out.println("The length of the string : "+s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Error : "+ e);
        }
        System.out.println("END");
    }
}
