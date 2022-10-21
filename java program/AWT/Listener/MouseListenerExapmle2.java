import java.awt.*;
import java.awt.event.*;



public class MouseListenerExapmle2 extends Frame implements MouseMotionListener {
    
    MouseListenerExapmle2(){
        addMouseMotionListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent e){
        Graphics g=getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 10, 30);
    }
    public void mouseMoved(MouseEvent e){}
    public static void main(String[] args) {
        new MouseListenerExapmle2();
    }
}
