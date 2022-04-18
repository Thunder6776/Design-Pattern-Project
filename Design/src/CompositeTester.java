/**
 * @author Alland Timas
 * tests composite pattern using two custom icons
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class CompositeTester{


    public static void main(String args[]){
      CompositeIcon cIcon = new CompositeIcon();
      cIcon.addIcon(new CircleIcon(), 100, 300);
      cIcon.addIcon(new SquareIcon(), 200, 0);
      cIcon.addIcon(new CircleIcon(), 300, 300);
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      JLabel label = new JLabel(cIcon);
      frame.getContentPane();
      label.setBounds(0, 0, 500, 500);
      panel.setLayout(null);
      panel.add(label);
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setSize(500, 500);
      frame.setVisible(true);
      frame.setResizable(false);

     }


}
