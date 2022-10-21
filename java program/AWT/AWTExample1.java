//import the awt class
import java.awt.*;

//Awt Example function which extends frame class 
public class AWTExample1 extends Frame{
   AWTExample1(){
      Button b=new Button("Click Me");
      //setting the button positon
      b.setBounds(30,100,100,30);
      add(b);
      setSize(300,300);
      setTitle("This is our basic AWT Example");
      setLayout(null);
      setVisible(true);

   }
   public static void main(String[] args) {
      AWTExample1 f=new AWTExample1();
   }
}