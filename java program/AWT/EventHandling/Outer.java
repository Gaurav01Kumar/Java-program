package AWT.EventHandling;



package AWT.EventHandling.AEvent;

import java.awt.event.ActionListener;

 class Outer  implements ActionListener{
    AEvent2 obj;
    Outer(AEvent2 obj){
        this.obj=obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.tf.setText("Hello this is outer class ");
    }
}
