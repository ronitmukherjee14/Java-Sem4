public class q2 {
    int var_ns = 14;
    static int var_s = 19;

    q2() {
        var_ns++;
        var_s++;
        System.out.println("Value of Non-static variable : " + var_ns);
        System.out.println("Value of static variable : " + var_s);
    }

    public static void main(String[] args) {
        q2 ob1 = new q2();
        q2 ob2 = new q2();
        q2 ob3 = new q2();
        q2 ob4 = new q2();
    }
}
