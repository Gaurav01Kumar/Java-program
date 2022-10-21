import java.util.ArrayList;
import java.util.Scanner;

public class arrayList{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String> name=new ArrayList<>();
        String h;
        while(true){
            System.out.print("Enter name ");
            h=s.next();
            name.add(h);
            System.out.println(name);
        }

        
    }
}