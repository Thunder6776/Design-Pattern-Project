
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Part1Tester{


    public static void main(String args[]){
        CompositeIcon cIcon = new CompositeIcon();
        
        cIcon.addIcon(new CircleIcon(), 50, 200);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel(cIcon.getSpecificIcon(0));
        frame.getContentPane();
      Dimension size = label.getPreferredSize();
      label.setBounds(cIcon.getxAttribute(0), cIcon.getyAttribute(0), cIcon.getIconWidth(), cIcon.getIconHeight());
      panel.setLayout(null);
      panel.add(label);
      panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setSize(500, 500);
      frame.setVisible(true);
        
        
        frame.setVisible(true);

     }


}
