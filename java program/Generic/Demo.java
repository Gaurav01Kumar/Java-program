
class Gen<T>{
    
    T obj;
    Gen(T obj){
        this.obj=obj;
    }
    T getOb(){
        return obj;
    }
    void showType(){
        System.out.println("The Type of T is = " + obj.getClass().getName());
    }
}

public class Demo {
    public static void main(String[] args) {
        Gen<Integer> i=new Gen<Integer>(23);
        i.showType();
        int data = i.getOb();
        System.out.println("The Value : " + data);
        Gen<Double> d=new Gen<Double>(23.33);
        d.showType();
        Double datas = d.getOb();
        System.out.println("The Value : " + datas);
    }
    
}
