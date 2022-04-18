/**
 * @author Alland Timas
 * Custom icon class to be used with CompositeIcon
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

public class CircleIcon implements Icon {

    public CircleIcon(){

    }


    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.CYAN);
        g2.fillOval(x, y, getIconWidth(), getIconHeight());
        
        }

    @Override
    public int getIconWidth() {
        // TODO Auto-generated method stub
        return 100;
    }

    @Override
    public int getIconHeight() {
        // TODO Auto-generated method stub
        return 100;
    }
    





}