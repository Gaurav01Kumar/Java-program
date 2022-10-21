import java.awt.*;;

public class CanvasExample {
   CanvasExample(){
    Frame f=new Frame("Canvas Example ");
    f.add(new MyCanvas());
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(400,400);
   }
   public static void main(String[] args) {
    new CanvasExample();
   }
}
class MyCanvas extends Canvas{
    public MyCanvas(){
    
     setBackground(Color.GRAY) ;
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(75, 75, 150, 150);
    }
       
}