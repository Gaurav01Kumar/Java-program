class para{
    int x,y;
    para(int a,int b){
        x=a;
        y=b;

    }
    void show(){
        System.out.println(x + " " + y);
    }

}
public class parameterC{
    public static void main(String[] args) {
        para p =new para(12,34);
        p.show();
    }
}
    