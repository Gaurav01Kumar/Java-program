import java.awt.*;
import java.awt.event.*;
public class ScrollbarExample1 {

    ScrollbarExample1(){
        Frame f=new Frame("Scrollbar Example ");
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setBounds(100,50,400,100);
        final Scrollbar s=new Scrollbar();
        s.setBounds(100, 100, 100, 300);
        f.add(l);
        f.add(s);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {   
                l.setText("Vertical scollbar value " + s.getValue());
            }
        });


    }
    public static void main(String[] args) {
        new ScrollbarExample1();
    }
    
}
