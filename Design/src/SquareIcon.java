/**
 * @author Alland Timas
 * Custom icon class to be used with composite icon
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;


public class SquareIcon implements Icon  {
   

    public SquareIcon() {

    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(Color.RED);
        g.fill3DRect(x, y, getIconWidth(), getIconHeight(), false);
        
    }

    @Override
    public int getIconWidth() {
        return 100;
    }

    @Override
    public int getIconHeight() {
        return 100;
    } 
    
}
