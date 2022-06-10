class staticTest {
    int p;
    String n;
    static String category = "Fruits";

    staticTest(int cp, String cn) {
        p = cp;
        n = cn;
    }

    void display() {
        System.out.println(p + "\t" + n + "\t" + category);

    }

}

public class Q1 {
    public static void main(String[] args) {
        staticTest a = new staticTest(10, "Mango");
        staticTest b = new staticTest(20, "Apple");
        a.display();
        b.display();
    }
}