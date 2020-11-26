import java.awt.*;
import java.util.Timer;

public class Cliente
{

    private Circulo circ;

    private static double auX, auY, vel;

    Cliente()
    {
        circ = new Circulo(0,0,20);
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
        g.fillOval((int)circ.getPx(), (int)circ.getPy(), circ.getD(), circ.getD());
        g.setColor(Color.WHITE);
        g.drawOval((int)circ.getPx(), (int)circ.getPy(), circ.getD(), circ.getD());
    }


    public static double getVel() {
        return vel;
    }

    public static void setVel(double vel) {
        Cliente.vel = vel;
    }

    public Circulo getCirc() {
        return circ;
    }

    public void setCirc(Circulo circ) {
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
