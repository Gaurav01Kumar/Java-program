public class compileTimePoly {
    void add(){
        int a=39,b=129,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int a, int b){
        int c;
        c=a+b;
        System.out.println(c);

    }
    public static void main(String[] args) {
        compileTimePoly C=new compileTimePoly();
        C.add();
        C.add(220,223);
    }
}
