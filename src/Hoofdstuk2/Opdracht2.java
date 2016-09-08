package Hoofdstuk2;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Nick", 20, 20);
        g.setColor(Color.red);
        g.drawString("Krause", 20, 32);
    }
}
