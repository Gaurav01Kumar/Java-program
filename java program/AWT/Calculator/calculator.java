import java.awt.*;

import java.awt.event.*;
import java.util.ArrayList;




public class  calculator implements MouseListener {
    Frame f;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextField tf;
    calculator(){
       f=new Frame("Calculator Program ");
       b1=new Button("9");
       tf=new TextField();
       tf.setBounds(100,70,200,50);
       b1.setBounds(100,150,50,50);
       b2=new Button("8");
       b2.setBounds(170,150,50,50);
       b3=new Button("7");
       b3.setBounds(240,150,50,50);
       b4=new Button("6");
       b4.setBounds(100,230,50,50);
       b5=new Button("5");
       b5.setBounds(170,230,50,50);
       b6=new Button("4");
       b6.setBounds(240,230,50,50);
       b7=new Button("3");
       b7.setBounds(100,300,50,50);
       b8=new Button("2");
       b8.setBounds(170,300,50,50);
       b9=new Button("1");
       b9.setBounds(240,300,50,50);
       
       //adding the element to frame
       f.add(tf);
       f.add(b1);
       f.add(b2);
       f.add(b3);
       f.add(b4);
       f.add(b5);
       f.add(b6);
       f.add(b7);
       f.add(b8);
       f.add(b9);
      //Calling mouseclick for all button 
      b1.addMouseListener(this);
      b2.addMouseListener(this);
       
       

       f.setSize(700,500);
       f.setLayout(null);
       f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        String str=b1.getLabel();
        ArrayList <String> a=new ArrayList<>();
        a.add(str);
        
        tf.setText(a.toString());
        
    }

    public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
    public void mousePressed(MouseEvent e) {}  
    public void mouseReleased(MouseEvent e) {}  
    public static void main(String[] args) {
        new calculator();
    }
}
