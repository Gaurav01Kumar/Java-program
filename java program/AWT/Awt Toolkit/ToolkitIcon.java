import java.awt.*;

public class ToolkitIcon {
    ToolkitIcon(){
        Frame f=new Frame("Changed icon");
        Image icon=Toolkit.getDefaultToolkit().getImage("./1.jpg");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new ToolkitIcon();
    }
}
