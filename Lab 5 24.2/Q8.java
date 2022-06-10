abstract class student {
    double rollno = 1503, regno = 1234;

    abstract void course();
}

class KIITIAN extends student {

    void course() {
        System.out.println("Your Roll Number is " + rollno);
        System.out.println("Your Registration Number is " + regno);
    }
}

public class Q8 {
    public static void main(String[] args) {
        student a = new KIITIAN();
        a.course();
    }
}
