import java.util.Arrays;
public class Q5 {
    public static void main(String[] args) {
        int n = 24;
        int arr[]={1,2,3};
        String s = String.valueOf(n)+" Ronit";
        System.out.println("valueOf() : "+s);
        s = Arrays.toString(arr);
        System.out.println("toString() : "+s);
    }
}
