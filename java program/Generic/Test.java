class Test{
    static <T> void genericDisplay(T ele){
        System.out.println(ele.getClass().getName() + " = " + ele);
    }
    public static void main(String[] args){
        genericDisplay(11);
        genericDisplay("Gaurav");
        genericDisplay(12.23444);

    }
}