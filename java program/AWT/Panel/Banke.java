import java.awt.*;
import java.awt.event.*;

public class Banke extends Frame  implements ActionListener {
    Label l1,l2,l3;
    TextField tf1;
    Button b1;
    Panel p;
    Banke(){
        
        l1=new Label("Enter Your Password ");
        tf1=new TextField();
        l2=new Label();
        l3=new Label("Error in password");
        b1=new Button("Login");
        
        l1.setBounds(20,60,150,20);
        l2.setBounds(20,80,150,20);
        l3.setBounds(20,120,150,20);
        l3.setFont(getFont());
        tf1.setBounds(144,60,100,34);
        b1.setBounds(250,60,70,34);
        b1.addActionListener(this);
        p=new Panel();
        p.setBounds(40,80,200,200);
        p.setBackground(Color.gray);
        add(tf1);
        add(l1);
        add(b1);
        add(l2);
        
      
        setSize(400,300);
        setLayout(null);
        setVisible(true);
       
    }
    public void actionPerformed(ActionEvent e){
        String str=tf1.getText();
        int pass=123;
        int p2=Integer.parseInt(str);
        if(pass==p2){
            
        remove(tf1);
        add(p);
        }else{
            add(l3);
        }
        
    }
    public static void main(String[] args){
        new Banke();
        
    }
}