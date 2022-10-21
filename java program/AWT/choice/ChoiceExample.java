import java.awt.*;
import java.awt.event.*;

public class ChoiceExample {
    ChoiceExample(){
        Frame  f=new Frame("Choice example ");
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(200,100);
        Button b=new Button("show ");
        b.setBounds(200,100,50,20);
        final Choice c=new Choice();
        c.setBounds(100,100,75,75);

        c.add("C++");
        c.add("Java");
        c.add("C");
        c.add("php");
        c.add("Reactjs");
        f.add(c);
        f.add(l);
        f.add(b);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e) {
            String data ="Programming language Selected "+c.getItem(c.getSelectedIndex());
            l.setText(data);
           }
        });

    }
    public static void main(String[] args) {
        new ChoiceExample();
    }
}
