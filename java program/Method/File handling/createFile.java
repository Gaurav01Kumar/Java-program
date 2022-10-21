

import java.io.*;

public class createFile {
    public static void main(String[] args) {
        File f=new File("data.txt");
        try{
            if(f.createNewFile()){
                System.out.println("New File is create ");
            }else{
                System.out.println("File is alredy exists");
            }
        }catch(IOException i){
            System.out.println(i);
        }
        

    }
}
