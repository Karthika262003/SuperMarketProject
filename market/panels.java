
package market;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class panels extends JPanel {
    Color first,second;
    Graphics g1;
    public panels(){
        setOpaque(false);
        this.setBackground(new Color(0,0,0,0));
    }
    
    private String color1="#CB3066";

    /**
     * Get the value of color1
     *
     * @return the value of color1
     */
    public String getColor1() {
        return color1;
    }

    /**
     * Set the value of color1
     *
     * @param color1 new value of color1
     */
    public void setColor1(String color1) {
        this.color1 = color1;
    }

    private String color2="#16BFFD";

    /**
     * Get the value of color2
     *
     * @return the value of color2
     */
    public String getColor2() {
        return color2;
    }

    /**
     * Set the value of color2
     *
     * @param color2 new value of color2
     */
    public void setColor2(String color2) {
        this.color2 = color2;
    }

    
    private int radius = 0;

   
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int side = 200;
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    @Override
 public void paintComponent(Graphics g){
         first=Color.decode(color1);
        second =Color.decode(color2);
        Graphics2D g2=(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint grp=new GradientPaint(0,0,first,getWidth(),getWidth(),second);
        g2.setPaint(grp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(),radius,radius);
        super.paintComponent(g);
 }
}
