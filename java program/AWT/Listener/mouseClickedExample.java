
import java.awt.*;
import java.awt.event.*;

public class mouseClickedExample extends Frame implements MouseListener  {
    Label l ;

    mouseClickedExample() {
        
        addMouseListener(this);
        l= new Label("nothing action is performed");
        l.setBounds(40, 50, 100, 30);
        
        l.setBackground(Color.green);
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse is clicked ");
        l.setBackground(Color.BLUE);
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse is Entered ");
        l.setBackground(Color.pink);
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse is Exited ");
        l.setBackground(Color.CYAN);
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse is Released ");
        l.setBackground(Color.DARK_GRAY);
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse is pressed ");
        l.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        new mouseClickedExample();
    }
}
