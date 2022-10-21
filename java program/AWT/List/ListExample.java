import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.LabelUI;
public class ListExample {
    ListExample(){
        Frame f=new Frame("List Example ");
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(500,100);
        Button b=new Button("Show ");
        b.setBounds(200,150,80,30);
       final List l1=new List(4,false) ;
       l1.setBounds(100,100,80,90);
       l1.add("Java");
       l1.add("C++");
       l1.add("phython");
       l1.add("PHP");
       final List l2=new List(4,true) ;
       l2.setBounds(100,200,80,90);
       l2.add("Spring");
       l2.add("Turbo c++");
       l2.add("Hibernate");
       l2.add("vscode");
     
       f.add(l1);
       f.add(l2);
       f.add(l);
       f.add(b);
       f.setSize(500,500);
       f.setLayout(null);
       f.setVisible(true);
       b.addActionListener(new ActionListener() {    
        public void actionPerformed(ActionEvent e) {         
         String data = "Programming language Selected: "+l1.getItem(l1.getSelectedIndex());    
         data += ", Framework Selected:";    
         for(String frame:l2.getSelectedItems()) {    
                  data += frame + " ";    
         }    
         l.setText(data);    
         }    
        }); 
    }
    public static void main(String[] args) {
        new ListExample();
    }
}
