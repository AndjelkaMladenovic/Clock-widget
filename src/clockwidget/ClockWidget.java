package clockwidget;
import javax.swing.JFrame;
public class ClockWidget {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.add(new Clock()); 
        frame.setVisible(true);  
    }
}