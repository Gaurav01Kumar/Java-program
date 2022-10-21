

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class showFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fi;
        if(args.length!=1){
          System.out.println("Usage :ShowFile filename ");
          return;
        }
        try{
            fi=new FileInputStream(args[0]);


        }catch(FileNotFoundException e){
            System.out.println("Cannot open file ");
            return;
        }
        try{
            do{
                i=fi.read();
                if(i!=-1){
                    System.out.println((char)i);
                }
            }while(i!= -1);
        }catch(IOException e){
            System.out.println("Error Reading file");
        }
        try {
            fi.close();
        } catch (IOException e) {
            
            System.out.println("Eroor closing file");
        }
    }
}
