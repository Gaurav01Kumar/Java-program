public class privateConstructor {
    int a; double b; String c;
    private privateConstructor(){
        a=10;
        b=12.4;
        c="Gaurav ";
        System.out.println(a + " " + b + " " + c);
    }
     public static void main(String[] args) {
         privateConstructor pc=new privateConstructor();
     }
}

