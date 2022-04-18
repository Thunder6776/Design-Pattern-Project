import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.Icon;

public class CompositeIcon implements Icon{
    private ArrayList<Icon> icons = new ArrayList<>();
    private ArrayList<Integer> xAttribute = new ArrayList<>();
    private ArrayList<Integer> yAttribute = new ArrayList<>();
    

    public CompositeIcon(){
        addIcon(new CircleIcon(), 200, 50);
        addIcon(new CircleIcon(), 10, 100);
    }


    public void addIcon(Icon icon, int x, int y){
        icons.add(icon);
        xAttribute.add(x);
        yAttribute.add(y);
        
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        
       for (int i = 0; i < icons.size(); i++) {
           x = xAttribute.get(i);
           y = yAttribute.get(i);
           icons.get(i).paintIcon(c,g, x, y);
       }
        
    }
    public Integer getxAttribute(int xHeight) {
        return xAttribute.get(xHeight);
    }
    public Integer getyAttribute(int yHeight) {
        return yAttribute.get(yHeight);
    }
    public Icon getSpecificIcon(int iconIndex){
       return icons.get(iconIndex);
    }
    public ArrayList<Icon> getIcons() {
        return icons;
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