import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader r=new FileReader("lastName.txt");
            try{
                int i;
                while((i=r.read())!=-1){
                    System.out.print((char )i);
                }
            }
            finally{
                r.close();
            }
        } catch (IOException i) {
          System.out.println(i);
        }
    }
}
