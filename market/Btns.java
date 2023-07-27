
package market;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JButton;
public class Btns extends JButton{   
       Color first,second;
       public Btns(){
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
}

    public String Color1 ="#0099F7";

    /**
     * Get the value of Color
     *
     * @return the value of Color
     */
    public String getColor() {
        return Color1;
    }

    /**
     * Set the value of Color
     *
     * @param Color new value of Color
     */
    public void setColor(String Color) {
        this.Color1 = Color;
    }
    public String Color2 = "#2c3e50";

    /**
     * Get the value of Color2
     *
     * @return the value of Color2
     */
    public String getColor2() {
        return Color2;
    }

    /**
     * Set the value of Color2
     *
     * @param Color2 new value of Color2
     */
    public void setColor2(String Color2) {
        this.Color2 = Color2;
    }

    public int radius = 0;

    /**
     * Get the value of radius
     *
     * @return the value of radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Set the value of radius
     *
     * @param radius new value of radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }


       @Override
    public void paintComponent(Graphics g){
        first=Color.decode(Color1);
        second =Color.decode(Color2);
        Graphics2D g2=(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint grp=new GradientPaint(0,0,first,getWidth(),getWidth(),second);
        g2.setPaint(grp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(),radius,radius);
        super.paintComponent(g);
    }
}
