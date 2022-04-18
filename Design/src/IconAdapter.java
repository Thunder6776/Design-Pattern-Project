/**
 * @author Alland Timas
 * Icon adapter to allow Icons to be used as a JComponent.
 */
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JComponent;

public class IconAdapter extends JComponent{
    
    private Icon icon;

    public IconAdapter(Icon icon){
            this.icon = icon;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        icon.paintIcon(this, g, 0, 0);
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(icon.getIconHeight(), icon.getIconWidth());
    }
}   
