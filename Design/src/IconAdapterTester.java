/**
 * @author Alland Timas
 * Test iconAdapter using custom Icon
 */
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class IconAdapterTester {
    public static void main(String args[]){
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JComponent comp = new IconAdapter(new SquareIcon());
        frame.getContentPane();
        panel.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(comp);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setResizable(false);
  
       }
}
