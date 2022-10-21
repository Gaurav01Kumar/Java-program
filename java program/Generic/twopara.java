class Gen<T, V,S>{
    T ot;
    V ov;
    S os;
    Gen(T ot, V ov, S os){
    this.ot=ot;
    this.ov=ov;
    this.os=os;

    }
    //show type 
    void showtype(){
        System.out.println("The type of T is " + ot.getClass().getName());
        System.out.println("The type of V is "+ ov.getClass().getName());
        System.out.println("The type of S is "+ os.getClass().getName());
    }
    T getGen1(){
        return ot;
    }
    V getGen2(){
        return ov;
    }
    S getGen3(){
        return os;
    }
   
}
public class twopara{
    public static void main(String[] args) {
        Gen<Integer , String, Double> otv=new Gen<Integer,String,Double>(34,"Gaurav",8.455);
        otv.showtype();
        int t=otv.getGen1();
        String v=otv.getGen2();
        Double d=otv.getGen3();
        System.out.println("Vaue : " + t);
        System.out.println("Vaue : " + v);
        System.out.println("Vaue : " + d);

    }
}