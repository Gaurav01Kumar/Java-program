import java.util.Scanner;

import java.lang.*;

public class studentData{
    String name;
    int roll,age;
    long number;

    public static void main(String[] args) {
        int op;
        input i=new input();
      dis opt=new dis();
      do{
        Scanner ip=new Scanner(System.in);
        System.out.println("1 : For Enter Student Details ");
        System.out.println("2 : See Data of Student");
        System.out.print(" Type  Your Choice ");
        op=ip.nextInt();
        switch(op){
            case 1 : i.InputData();break;
            case 2: opt.Display();break;
            default : System.out.println("Your Choice is error.........");
        }
    }while(op<=2);
    }
}
class input{
    void InputData(){
        studentData sdata=new studentData();
        Scanner ip=new Scanner(System.in);
        System.out.print(" Enter Name of Student ");
         sdata.name=ip.nextLine();
         System.out.print(" Enter Roll of student ");
         sdata.roll=ip.nextInt();
         System.out.print(" Enter Age of student ");
         sdata.age=ip.nextInt();
         if(sdata.age >=18 && sdata.age <=30 ){

            System.out.print(" Enter Mobile Number  of student ");
            sdata.number=ip.nextLong();
           
         }else
         {
            System.out.println("Your Age is Not eligible ");
            System.exit(0);
         }
        
}
    
}
class dis{
    void Display(){
        studentData d= new studentData();
        System.out.println(" Name      Roll      Age      Mobile");
        System.out.print( ""+d.name + " \t " + d.roll + "\t      " + d.age + "  \t  " + d.number);
    }
}