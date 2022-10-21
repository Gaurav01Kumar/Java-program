import java.awt.*;
import java.awt.event.*;
public class Calculator  extends Frame implements ActionListener{
    
        Frame f = new Frame("Calculator App in java ");
        TextField t1, t2, t3;
        Button b1,b2,b3,b4;
      Calculator(){
        t1 = new TextField();

        t1.setBounds(100, 50, 100, 30);
        t2 = new TextField();

        t2.setBounds(100, 100, 100, 30);

        t3 = new TextField();
        t3.setEditable(false);

        t3.setBounds(100, 150, 130, 30);

        //Generating button for cacluate 
        b1=new Button(" + ");
        b1.setBounds(60,200,50,30);
        b2=new Button(" - ");
        b2.setBounds(120,200,50,30);
        b3=new Button(" x ");
        b3.setBounds(180,200,50,30);
        b4=new Button(" / ");
        b4.setBounds(250,200,50,30);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
        f.add(t1);
        f.add(t2);
        f.add(t3);

        //Adding the button in frame 
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(400, 400);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s1=t1.getText();
        String s2=t2.getText();
        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        int ans=0;
        if(e.getSource()==b1){
            ans=num1+num2;
        }else if(e.getSource()==b2){
            ans=num1-num2;

        }else if(e.getSource()==b3){
            ans=num1*num2;
        }else{
            ans=num1/num2;
        }
        String result =String.valueOf(ans);
        t3.setText(result);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
