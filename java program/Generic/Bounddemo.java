import java.util.*;
import java.math.*;
class stats<T extends Number>{
    T[] obj;
    stats(T[] onj){
        this.obj=onj;
    }
    double average(){
        double sum=0;
        for(int i=0;i<obj.length;i++){
            sum+=obj[i].doubleValue();
          
        }
        return sum / obj.length;
    }

}
public class Bounddemo {
    public static void main(String[] args) {
        System.out.println("Good Morning , Lets Works on your Dream ");
        Integer nums[]={1,2,3,4,5};
        stats<Integer> iob=new stats<Integer>(nums);
        double v=iob.average();
        System.out.println(" Average "+ v);
        Double dnum[]={1.0,2.5,3.5,4.5,5.5};
        stats<Double> dob=new stats<Double>(dnum);
        double dv=dob.average();
        System.out.println(" Average "+ dv);
    }
}
