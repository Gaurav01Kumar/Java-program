
class Test <T>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }
    public T getObj(){return this.obj;}
}
public class TestClass {
    public static void main(String[] args) {
        Test<Integer> iobj=new Test<Integer>(34);
        System.out.println(iobj.getObj());
        Test<String > sobj=new Test<String>("My name is gaurav ");
        System.out.println(sobj.getObj());

    }
}
