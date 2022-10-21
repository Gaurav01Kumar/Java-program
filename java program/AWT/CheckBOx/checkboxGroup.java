
import java.awt.*;
import java.awt.event.*;

public class checkboxGroup {
    checkboxGroup(){
        Frame f=new Frame("Checkbox group example");
        Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        CheckboxGroup cgb=new CheckboxGroup();
        Checkbox ch1=new Checkbox("C++ ", cgb, false);
        ch1.setBounds(100,100,50,50);
        Checkbox ch2=new Checkbox("java ", cgb, true);
        ch2.setBounds(100,150,50,50);
        f.add(ch1);f.add(ch2);f.add(l);
        

        ch1.addItemListener(new ItemListener(){
     public void itemStateChanged(ItemEvent e){
        l.setText("C++ :Checked ");
     }
        });
        ch2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
               l.setText("Java Checkbox: checked ");
            }
               });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new checkboxGroup();
    }
}
