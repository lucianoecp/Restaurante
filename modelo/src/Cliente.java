import java.awt.*;
import java.util.*;
import java.util.List;

public class Cliente
{
    private Figura circ;

    private static double auX, auY, vel;

    Cliente()
    {
        circ = new Figura(0,0,20);
        circ.setDx(3);
        circ.setDy(3);
        this.vel = 1;
    }

    //teste
    public void movimento()
    {
        auX = circ.getPx();
        auY = circ.getPy();

        if(circ.getPx()<600 && circ.getPy()<360)
        {
            System.out.println(circ.getPx()+"/"+circ.getPy());

            circ.setPx(auX+circ.getDx()*getVel());
            circ.setPy(auY+circ.getDy()*getVel());

        }
        else{
            circ.setPy(0);
            circ.setPx(0);
        }
    }

    public  void moveToPosition(int xf, int yf)
    {
        double ftx = 0, fty= 0;
        int numPassos = 50;

        auX = circ.getPx();
        auY = circ.getPy();

        if(auX != xf && auY != yf)
        {
            ftx = (auX - xf)*(-1)/numPassos;
            fty = (auY - yf)*(-1)/numPassos;
        }

        circ.setPx((auX + ftx));
        circ.setPy((auY + fty));



    }

    public void tick()
    {
        //movimento();

    }

    public void render(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillOval((int)circ.getPx(), (int)circ.getPy(), circ.getTamanho(), circ.getTamanho());
        g.setColor(Color.WHITE);
        g.drawOval((int)circ.getPx(), (int)circ.getPy(), circ.getTamanho(), circ.getTamanho());
    }


    public static double getVel() {
        return vel;
    }

    public static void setVel(double vel) {
        Cliente.vel = vel;
    }

    public Figura getCirc() {
        return circ;
    }

    public void setCirc(Figura circ) {
        this.circ = circ;
    }

    public static double getAuX() {
        return auX;
    }

    public static void setAuX(double auX) {
        Cliente.auX = auX;
    }

    public static double getAuY() {
        return auY;
    }

    public static void setAuY(double auY) {
        Cliente.auY = auY;
    }


}
