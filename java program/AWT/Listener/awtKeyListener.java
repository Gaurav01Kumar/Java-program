import java.awt.*;
import java.awt.event.*;


public class awtKeyListener extends Frame implements KeyListener {
 Label l;
 TextArea a;
 awtKeyListener(){
    l=new Label();
    l.setBounds(100,70,100,20);
    a=new TextArea();
    a.setBounds(100,100,100,100);
         a.addKeyListener(this);
    add(l);
    add(a);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
 }

 public void  keyPressed(KeyEvent e){
    l.setText("key is pressed");
 }
 public void keyReleased(KeyEvent e){
    l.setText("Key is Release ");
 }
 public void keyTyped(KeyEvent e){
    l.setText("Key is typed ");
 }
 public static void main(String[] args) {
    new awtKeyListener();
 }
}
