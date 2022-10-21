 class A{
    int a=39;
    A(){
        System.out.println(" I am super class constructor");
    }
    void show(){
        System.out.println("My name is gaurav ");
    }
}
class B extends A{
    int a=900; 
       B(){
           System.out.println("I am B Class Constructor");
       }
        // System.out.println(a); //this line acces the self data which is 900
        // System.out.println(super.a);//when we use super keyword then it acces a claas
        void show(){
            super.show();
            System.out.println("I am iin bca ");
        }
    
}

public class superd {
    public static void main(String[] args) {
        B r=new B();
        
    }
}
