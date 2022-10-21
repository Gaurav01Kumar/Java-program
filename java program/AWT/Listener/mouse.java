import java.awt.*;

import java.awt.event.*;
public class mouse  extends Frame implements MouseListener {
  Button b1;   
  mouse(){
    b1=new Button("3");
    b1.setBounds(33,55,40,55);
    add(b1);
    b1.addMouseListener(this);
    setSize(333,244);
    setVisible(true);
    setLayout(null);
  }
  public void mouseClicked(MouseEvent e){
    String str=b1.getActionCommand();
    System.out.println(str);
  }
  public void mouseEntered(MouseEvent e) {}  
  public void mouseExited(MouseEvent e) {}  
  public void mousePressed(MouseEvent e) {}  
  public void mouseReleased(MouseEvent e) {}  
  public static void main(String[] args) {
    new mouse();
  }
}
