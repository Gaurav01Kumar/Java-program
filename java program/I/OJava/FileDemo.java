
import java.io.File;
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1=new File("java/CopyRight.txt");
          p("File Name: " + f1.getName());
          p("File Exists: " + f1.exists());
          p("Absolute path :" + f1.getAbsolutePath());
          p("parent : " + f1.getParent());
          p(f1.canRead() ? "is readeeable": "not readable");
          p("file size"+ f1.length());
          p("last modification" + f1.lastModified());


    }
}
