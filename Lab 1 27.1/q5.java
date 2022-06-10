import java.util.*;

public class q5 {
    public static void main(String[] args) {
        int marks[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your Roll no : ");
        int roll = sc.nextInt();
        System.out.println("Enter 5 marks");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }
        float avg = sum / 5;
        System.out.println("NAME IS : " + name);
        System.out.println("ROLL NO IS : " + roll);
        System.out.println("CGPA = " + (avg / 10));
        if (avg > 90)
            System.out.println("GRADE = O");
        else if (avg > 80)
            System.out.println("GRADE = E");
        else if (avg > 70)
            System.out.println("GRADE = A");
        else if (avg > 60)
            System.out.println("GRADE = B");
        else if (avg > 50)
            System.out.println("GRADE = C");
        else if (avg > 40)
            System.out.println("GRADE = D");
        else
            System.out.println("GRADE = F");
        sc.close();
    }
}
