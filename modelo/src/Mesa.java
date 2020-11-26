import java.awt.*;

public class Mesa
{

    private Quadrado qd;
    private static int px, py, vel;

    Mesa(int px, int py)
    {
        qd = new Quadrado(px, py, 60);
    }

    public void tick()
    {
        //movimento();

    }

    public static void setPy(int py) {
        Mesa.py = py;
    }

    public static int getPx() {
        return px;
    }

    public static int getVel() {
        return vel;
    }

    public static void setVel(int vel) {
        Mesa.vel = vel;
    }

    public static void setPx(int px) {
        Mesa.px = px;
    }

    public static int getPy() {
        return py;
    }

    public void render(Graphics g)
    {
        g.setColor(Color.ORANGE);
        g.fillRect((int)qd.getPx(), (int)qd.getPy(), qd.getL(), qd.getL());
    }

    public void setQd(Quadrado qd) {
        this.qd = qd;
    }

    public Quadrado getQd() {
        return qd;
    }




}
