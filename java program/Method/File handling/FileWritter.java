import java.io.FileWriter;
import java.io.IOException;

public class FileWritter {
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("lastName.txt");
            try{
                f.write("My name is gaurav h Kumar");
            }
            finally{
                f.close();
            }
            System.out.println("Succefully wirte in data");
        } catch (IOException e) {
           System.out.println(e);
        }
    }
}
