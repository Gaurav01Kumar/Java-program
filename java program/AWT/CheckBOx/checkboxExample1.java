import java.awt.*;
import java.awt.event.*;

public class checkboxExample1 {
    Frame f=new Frame("Check Box Example ");
    checkboxExample1(){
Checkbox ch=new Checkbox("C++");
ch.setBounds(100,100,50,50);
Checkbox ch1=new Checkbox("Java");
ch1.setBounds(100,150,50,50);

f.add(ch);
f.add(ch1);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
    }
    public static void main(String[] args) {
        new checkboxExample1();
    }
}
