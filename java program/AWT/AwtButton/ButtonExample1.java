
import java.awt.*;
public class ButtonExample1 {
    public static void main(String[] args) {
        
        Frame f=new Frame();
        Button b=new Button("Click me ");
        b.setBounds(30,100,80,30);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
