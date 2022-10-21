import java.awt.*;
import java.awt.event.*;

public class keyListenerExample2 extends Frame implements KeyListener{
    Label l;
    TextArea a;
    keyListenerExample2(){
        l=new Label();
        l.setBounds(20,50,200,20);
        a=new TextArea();
        a.setBounds(20,100,200,300);
        a.addKeyListener(this);
        add(l);add(a);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e){}
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e){
        String text=a.getText();
        String word[]=text.split("\\s");
        l.setText("Words : "+ word.length + "Character : " + text.length());
    }
    public static void main(String[] args) {
        new keyListenerExample2();
    }
    
}
