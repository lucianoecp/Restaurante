import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Garcom
{
    private float px, py;
    private static BufferedImage img;

    Garcom(int px, int py)
    {
        this.px = px;
        this.py = py;


    }

    public void setPx(float px) {
        this.px = px;
    }

    public float getPx() {
        return px;
    }

    public void setPy(float py) {
        this.py = py;
    }

    public float getPy() {
        return py;
    }


    public static Image getImg() {
        return img;
    }

    public void render(Graphics g)
    {
        //g.drawImage(img,(int)px,(int)py,null);
        g.setColor(Color.RED);
        g.fillOval((int)px,(int)py, 25, 25);

        g.setColor(Color.BLACK);
        g.drawOval((int)px,(int)py, 25, 25);
    }

}
