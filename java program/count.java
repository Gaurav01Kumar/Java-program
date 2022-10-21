class count{
 public static void main(String arg[]) {
     
   loop(20,40);
    System.out.println("***********************");

  loop1();
}
public static void loop1() {
    System.out.println("We are in the 2nd loop function");
    int b=11;
    while(b<=20){
        System.out.println(b);
        b++;
    }
}
public static void loop(int a, int n) {
    
    System.out.println("We are in the 1st loop function");
    while(a<=n){
        System.out.println(a);
        a++;
    }
}

}