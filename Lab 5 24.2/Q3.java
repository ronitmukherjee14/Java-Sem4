class rectangle {
    int l, w;

    rectangle(int length, int width) {
        l = length;
        w = width;
    }
}

class cube extends rectangle {
    int h;

    cube(int length, int width, int height) {
        super(length, width);
        h = height;
    }

    void show() {
        System.out.println("Length: " + l);
        System.out.println("Breadth: " + w);
        System.out.println("Height: " + h);
    }
}

public class Q3 {
    public static void main(String[] args) {
        box a = new box(5, 10, 20);
        a.show();
    }
}