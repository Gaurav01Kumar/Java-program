import java.util.Scanner;

public class electricill{
    public static void main(String[] args) {
        double unit;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter unit of electric : ");
        unit=sc.nextDouble();
        double amount =0;
        switch(caseNo(unit)){
            case 1: amount=unit*.50;break;
            case 2: amount=unit*.75;break;
            case 3: amount=unit*1.20;break;
            case 4: amount=unit*1.50 ;
                     double per=(20*amount)/100;
                     
                     amount+=per;
                           break;
            default : System.out.println("your unit is wrong");
        }
        System.out.println("Your total bill of electric = " + amount);

    }
    public static int caseNo(double unit){
        int caseValue=0;
        if(unit>=1 &&  unit <=50.0){
            caseValue =1;
            
        } else if(unit>=50.0 &&  unit <=150.0){
            caseValue =2;
            
        } 
        else if(unit>=150.0 &&  unit <=250.0){
            caseValue =3;
            
        } else{
            caseValue=4;
        }
        return caseValue;
    }
}
