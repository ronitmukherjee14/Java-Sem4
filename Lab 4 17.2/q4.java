public class q4 {

    int c;
    void q4 ()
    {
        c = 0;
    }
    void q4 ( int a)
    {
        c = c + a;
    }
    void q4 ( int a, int b)
    {
        System.out.println(c);
        System.out.println(c + "\t" + a + "\t" + b);
    }
public static void main(String[] args) {
    q4 obj = new q4();
    obj.q4();
    obj.q4(2);
    obj.q4(3, 4);
}
}
