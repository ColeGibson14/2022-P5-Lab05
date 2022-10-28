// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);

        //bottom right
        int bx1 = 10;
        int by1 = 640;
        int bx2 = 990;
        int by2 = 640;

        for (int k = 0;k < 49; k++) {

            g.drawLine(bx1, by1, bx2, by2);

            bx1 += 20;
            by2 -= 13;
        }

        // bottom left
        int lx1 = 990;
        int ly1 = 640;
        int lx2 = 10;
        int ly2 = 640;

        for(int k = 0; k < 49; k++){

            g.drawLine(lx1, ly1, lx2, ly2);

            lx1 -= 20;
            ly2 -= 13;

        }

        // Top Left

        int tx1 = 10;
        int ty1 = 10;
        int tx2 = 990;
        int ty2 = 10;

        for(int k = 0; k < 49; k++) {

            g.drawLine(tx1,ty1,tx2,ty2);

            tx2 -= 20;
            ty1 += 13;
        }

        //Top Right

        int hx1 = 10;
        int hy1 = 10;
        int hx2 = 990;
        int hy2 = 10;

        for(int k = 0; k < 49; k++) {

            g.drawLine(hx1,hy1,hx2,hy2);

            hx1 += 20;
            hy2 += 13;
        }
}}

