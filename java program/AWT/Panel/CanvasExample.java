import java.awt.*;  
  
// class to construct a frame and containing main method    
public class CanvasExample    
{    
  // class constructor   
  public CanvasExample()    
  {    
  
    // creating a frame  
    Frame f = new Frame("Canvas Example");   
    // adding canvas to frame   
    f.add(new MyCanvas());    
  
    // setting layout, size and visibility of frame  
    f.setLayout(null);    
    f.setSize(400, 400);    
    f.setVisible(true);    
  }    
  
  // main method  
  public static void main(String args[])    
  {    
    new CanvasExample();    
  }    
}    
  
// class which inherits the Canvas class  
// to create Canvas  
class MyCanvas extends Canvas    
{    
        // class constructor  
        public MyCanvas() {    
        setBackground (Color.GRAY);    
        setSize(300, 200);    
     }    
  
     // paint() method to draw inside the canvas  
  public void paint(Graphics g)    
  {    
  
    // adding specifications  
    g.setColor(Color.red);    
      
     //so this will be left curve

    g.fillArc(30, 50, 200,200, 60, 60);  
    g.fillOval(30, 50, 50, 50);
    
  }    
}       