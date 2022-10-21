import java.awt.*;
import java.awt.event.*;

public class mybook extends Frame implements ActionListener {
    Button b1,b2;
    TextArea area;
    public mybook(){
       setSize(700,700); 
       setVisible(true);
       setLayout(null);
       b1=new Button("Click ");
       b2=new Button("Clear ");
       area=new TextArea();
       b1.setBounds(350,600,50,35);
       b2.setBounds(410,600,50,35);
       area.setBounds(100,100,200,55);
       add(b1);add(b2);add(area);
       b1.addActionListener(this);
       b2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            area.setText("Welcome to java Textarea ");
        }else{
            area.setText(" ");
        }
    }
    public static void main(String[] args) {
        new mybook();
    }
}
