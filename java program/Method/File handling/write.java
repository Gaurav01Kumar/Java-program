import java.io.PrintWriter;

public class write {
    public static void main(String[] args) {
        PrintWriter pw=new PrintWriter(System.out,true);
        pw.println("This is a string ");
        int i=-2;
        pw.println(i);
        char a='A';
        System.out.write(a);
    }
}
