class Stats<T extends Number>{
    T[] nums;
    Stats(T[] obj){
this.nums=obj;
    }
    double average(){
        double sum=0.0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i].doubleValue();
        }
        return sum / nums.length;
    }
    boolean SameAvg(Stats<?> ob){
        if(average()==ob.average())
        return true;

        return false;
    }
}

public class wildcardDemo {
    public static void main(String[] args) {
        System.out.println("Time up , this is a last today code of java ");
        Double dnum[]={1.1,2.2,3.3,4.4,5.5,6.6};
        Stats<Double> dob=new Stats<Double>(dnum);
        double value=dob.average();
        System.out.println("Value of dob is "+ value);
        Integer inum[]={1,2,3,4,5,6};
        Stats<Integer> iob=new Stats<Integer>(inum);
        double value2=iob.average();
        System.out.println("Value of iob is "+ value2);
        Float fnum[]={1.0F,2.0F,3.0F,4.0F,5.0F,6.0F};
        Stats<Float> fob=new Stats<Float>(fnum);
        double value3=fob.average();
        System.out.println("Value of dob is "+ value3);
        //Check the average is ame or not 

        System.out.print("The average of dob and fob ");
        if(dob.SameAvg(fob))
        System.out.println("same");
        else
        System.out.println("differ");
        System.out.print("The average of iob and fob ");
        if(iob.SameAvg(fob))
        System.out.println("same");
        else
        System.out.println("differ");
        System.out.print("The average of iob and dob ");
        if(iob.SameAvg(dob))
        System.out.println("same");
        else
        System.out.println("differ");
    }
}
