import java.io.*;
import java.awt.*;
import java.applet.*;

public class Q8 extends Applet {
    public void paint(Graphics g) {
        g.drawString(".html path : "+(getDocumentBase()).toString(), 30, 50);
        g.drawString(".class path : " + (getCodeBase()).toString(), 30, 70);
    }
}