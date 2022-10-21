import java.awt.*;

public class TextAreaExample1 {
    TextAreaExample1(){
        Frame f=new Frame("Text Area Example ");
        TextArea area=new TextArea("Welcome to My program ");
        area.setBounds(20,40,300,300);
        
f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TextAreaExample1();
    }
}
