import java.awt.*;
import java.awt.event.*;
public class ToolkitExample2 {
    public static void main(String[] args) {
        Frame f=new Frame("Toolkit Example ");
        Button b=new Button("beep");
        f.setBackground(Color.BLUE);
        b.setBounds(50,100,60,30);
        f.add(b);
        f.setSize(300,300);
        b.setBackground(Color.MAGENTA);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Toolkit.getDefaultToolkit().beep();
            }
        });
    }
}
