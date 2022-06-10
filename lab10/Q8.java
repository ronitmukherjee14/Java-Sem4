import java.io.*;

public class Q8 {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("input1.txt");
        FileOutputStream out = new FileOutputStream("output1.txt");
        int c;
        System.out.println("Reading and Writing to file using byte stream .........");
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
            out.write(c);
        }
        in.close();
        out.close();
        System.out.println("\n");
        c = 0;
        System.out.println("Reading and Writing to file using char stream ");
        FileReader inc = new FileReader("input1.txt");
        FileWriter outc = new FileWriter("output2.txt");
        while ((c = inc.read()) != -1) {
            outc.write(c);
            System.out.print((char) c);
        }
        inc.close();
        outc.close();
    }
}