package demos;

import java.applet.Applet;
import java.awt.*;

public class variabelen extends Applet {

    Color achtergrond;
    Color tekst;
    int getal1;
    int getal2;
    Font mijnFont;

    @Override
    public void init() {
        super.init();
        achtergrond = new Color(255, 204, 204);
        tekst = new Color(0, 32, 120);
        getal1 = 20;
        getal2 = 30;
        setBackground(achtergrond);
        mijnFont = new Font("TimesRoman", Font.BOLD, 18);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(tekst);
        int x = 50;
        int y =50;
        g.setFont(mijnFont);
        g.drawString("Som is;" + (getal1 + getal2), x, y );
        y = y + 20;
        g.drawString("Som is;" + (getal1 * getal2), x, y );
    }
}
