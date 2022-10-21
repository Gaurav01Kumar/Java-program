import java.awt.*;

import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;   

public class windowExample extends Frame implements WindowListener {
    windowExample(){
        addWindowListener(this);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new windowExample();
    }
    public void windowActivated(WindowEvent argO){
        System.out.println("Activated");
    }
    public void windowClosed(WindowEvent argO){
        System.out.println("Closed ");
    }
    public void windowClosing(WindowEvent argO){
        System.out.println("Closing ");
        dispose();
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Window Deactivated");
    }
    public void windowIconified(WindowEvent arg0) {    
        System.out.println("iconified");    
    }    
    public void windowOpened(WindowEvent argO){R
        System.out.println("Window opened");

    }
    public void windowDeiconified(WindowEvent argO){
        System.out.println("Deconified");
    }
    
}
