import java.awt.*;
import java.awt.event.*;

public class checkboxExample2 {
    checkboxExample2(){
        Frame f=new Frame("Check box example with event handling ");
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        Checkbox ch1=new Checkbox("C++");
        Checkbox ch2=new Checkbox("java");
        ch1.setBounds(100,100,70,70);
        ch2.setBounds(100,150,70,70);
        f.add(ch1);f.add(ch2);f.add(l);
        ch1.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               l.setText("C++ Checkbox: "     
               + (e.getStateChange()==1?"checked":"unchecked"));    
            }    
         });  
       ch2.addItemListener(new ItemListener(){
public void itemStateChanged(ItemEvent e){
    l.setText("java "+ (e.getStateChange()==1 ? "Checkdd ": "uncheckd"));
}
       });
        f.setSize(400,400);
        f.setLayout( null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new checkboxExample2();
    }
}
